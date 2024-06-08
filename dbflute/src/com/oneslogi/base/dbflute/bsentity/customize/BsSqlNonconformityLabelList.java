package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlNonconformityLabelList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRBADITEMCASE_ID, CREATEDDATE, TARGETMON, ITEMCD, PRODUCT_ABBR, LBLKBN, INOUTKBN, VA_EXTDATA2, ALLOCPOLICYKEY, CASE_NUM, BADITEMCD, TODAY_NUM, CREATEDNUM, REPRINTEDFLG, VA_EXTDATA1, VERSION_NO, USERNUM3, CENTER_ID, CENTER_NM, CLIENT_ID, CLIENT_NM
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
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
 * Long trbaditemcaseId = entity.getTrbaditemcaseId();
 * String createddate = entity.getCreateddate();
 * String targetmon = entity.getTargetmon();
 * String itemcd = entity.getItemcd();
 * String productAbbr = entity.getProductAbbr();
 * String lblkbn = entity.getLblkbn();
 * String inoutkbn = entity.getInoutkbn();
 * String vaExtdata2 = entity.getVaExtdata2();
 * java.math.BigDecimal allocpolicykey = entity.getAllocpolicykey();
 * java.math.BigDecimal caseNum = entity.getCaseNum();
 * java.math.BigDecimal baditemcd = entity.getBaditemcd();
 * Integer todayNum = entity.getTodayNum();
 * Long creatednum = entity.getCreatednum();
 * String reprintedflg = entity.getReprintedflg();
 * String vaExtdata1 = entity.getVaExtdata1();
 * Long versionNo = entity.getVersionNo();
 * Long usernum3 = entity.getUsernum3();
 * Long centerId = entity.getCenterId();
 * String centerNm = entity.getCenterNm();
 * Long clientId = entity.getClientId();
 * String clientNm = entity.getClientNm();
 * entity.setTrbaditemcaseId(trbaditemcaseId);
 * entity.setCreateddate(createddate);
 * entity.setTargetmon(targetmon);
 * entity.setItemcd(itemcd);
 * entity.setProductAbbr(productAbbr);
 * entity.setLblkbn(lblkbn);
 * entity.setInoutkbn(inoutkbn);
 * entity.setVaExtdata2(vaExtdata2);
 * entity.setAllocpolicykey(allocpolicykey);
 * entity.setCaseNum(caseNum);
 * entity.setBaditemcd(baditemcd);
 * entity.setTodayNum(todayNum);
 * entity.setCreatednum(creatednum);
 * entity.setReprintedflg(reprintedflg);
 * entity.setVaExtdata1(vaExtdata1);
 * entity.setVersionNo(versionNo);
 * entity.setUsernum3(usernum3);
 * entity.setCenterId(centerId);
 * entity.setCenterNm(centerNm);
 * entity.setClientId(clientId);
 * entity.setClientNm(clientNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlNonconformityLabelList extends AbstractEntity implements CustomizeEntity {

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

    /** CREATEDDATE: {varchar(8)} */
    protected String _createddate;

    /** TARGETMON: {varchar(8)} */
    protected String _targetmon;

    /** ITEMCD: {varchar(30)} */
    protected String _itemcd;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** LBLKBN: {varchar(30)} */
    protected String _lblkbn;

    /** INOUTKBN: {varchar(30)} */
    protected String _inoutkbn;

    /** VA_EXTDATA2: {varchar(30)} */
    protected String _vaExtdata2;

    /** ALLOCPOLICYKEY: {decimal(16, 6)} */
    protected java.math.BigDecimal _allocpolicykey;

    /** CASE_NUM: {decimal(33, 12)} */
    protected java.math.BigDecimal _caseNum;

    /** BADITEMCD: {decimal(16, 6)} */
    protected java.math.BigDecimal _baditemcd;

    /** TODAY_NUM: {int(10)} */
    protected Integer _todayNum;

    /** CREATEDNUM: {bigint(19)} */
    protected Long _creatednum;

    /** REPRINTEDFLG: {varchar(30)} */
    protected String _reprintedflg;

    /** VA_EXTDATA1: {varchar(30)} */
    protected String _vaExtdata1;

    /** VERSION_NO: {bigint(19)} */
    protected Long _versionNo;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** CENTER_ID: {bigint(19)} */
    protected Long _centerId;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CLIENT_ID: {bigint(19)} */
    protected Long _clientId;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlNonconformityLabelListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlNonconformityLabelList";
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
        if (obj instanceof BsSqlNonconformityLabelList) {
            BsSqlNonconformityLabelList other = (BsSqlNonconformityLabelList)obj;
            if (!xSV(_trbaditemcaseId, other._trbaditemcaseId)) { return false; }
            if (!xSV(_createddate, other._createddate)) { return false; }
            if (!xSV(_targetmon, other._targetmon)) { return false; }
            if (!xSV(_itemcd, other._itemcd)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_lblkbn, other._lblkbn)) { return false; }
            if (!xSV(_inoutkbn, other._inoutkbn)) { return false; }
            if (!xSV(_vaExtdata2, other._vaExtdata2)) { return false; }
            if (!xSV(_allocpolicykey, other._allocpolicykey)) { return false; }
            if (!xSV(_caseNum, other._caseNum)) { return false; }
            if (!xSV(_baditemcd, other._baditemcd)) { return false; }
            if (!xSV(_todayNum, other._todayNum)) { return false; }
            if (!xSV(_creatednum, other._creatednum)) { return false; }
            if (!xSV(_reprintedflg, other._reprintedflg)) { return false; }
            if (!xSV(_vaExtdata1, other._vaExtdata1)) { return false; }
            if (!xSV(_versionNo, other._versionNo)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_centerId, other._centerId)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_clientId, other._clientId)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
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
        hs = xCH(hs, _createddate);
        hs = xCH(hs, _targetmon);
        hs = xCH(hs, _itemcd);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _lblkbn);
        hs = xCH(hs, _inoutkbn);
        hs = xCH(hs, _vaExtdata2);
        hs = xCH(hs, _allocpolicykey);
        hs = xCH(hs, _caseNum);
        hs = xCH(hs, _baditemcd);
        hs = xCH(hs, _todayNum);
        hs = xCH(hs, _creatednum);
        hs = xCH(hs, _reprintedflg);
        hs = xCH(hs, _vaExtdata1);
        hs = xCH(hs, _versionNo);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _centerId);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _clientId);
        hs = xCH(hs, _clientNm);
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
        sb.append(dm).append(xfND(_createddate));
        sb.append(dm).append(xfND(_targetmon));
        sb.append(dm).append(xfND(_itemcd));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_lblkbn));
        sb.append(dm).append(xfND(_inoutkbn));
        sb.append(dm).append(xfND(_vaExtdata2));
        sb.append(dm).append(xfND(_allocpolicykey));
        sb.append(dm).append(xfND(_caseNum));
        sb.append(dm).append(xfND(_baditemcd));
        sb.append(dm).append(xfND(_todayNum));
        sb.append(dm).append(xfND(_creatednum));
        sb.append(dm).append(xfND(_reprintedflg));
        sb.append(dm).append(xfND(_vaExtdata1));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_centerId));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientId));
        sb.append(dm).append(xfND(_clientNm));
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
    public SqlNonconformityLabelList clone() {
        return (SqlNonconformityLabelList)super.clone();
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
     * [get] LBLKBN: {varchar(30)} <br>
     * @return The value of the column 'LBLKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getLblkbn() {
        checkSpecifiedProperty("lblkbn");
        return convertEmptyToNull(_lblkbn);
    }

    /**
     * [set] LBLKBN: {varchar(30)} <br>
     * @param lblkbn The value of the column 'LBLKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLblkbn(String lblkbn) {
        registerModifiedProperty("lblkbn");
        _lblkbn = lblkbn;
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
     * [get] TODAY_NUM: {int(10)} <br>
     * @return The value of the column 'TODAY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getTodayNum() {
        checkSpecifiedProperty("todayNum");
        return _todayNum;
    }

    /**
     * [set] TODAY_NUM: {int(10)} <br>
     * @param todayNum The value of the column 'TODAY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTodayNum(Integer todayNum) {
        registerModifiedProperty("todayNum");
        _todayNum = todayNum;
    }

    /**
     * [get] CREATEDNUM: {bigint(19)} <br>
     * @return The value of the column 'CREATEDNUM'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCreatednum() {
        checkSpecifiedProperty("creatednum");
        return _creatednum;
    }

    /**
     * [set] CREATEDNUM: {bigint(19)} <br>
     * @param creatednum The value of the column 'CREATEDNUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCreatednum(Long creatednum) {
        registerModifiedProperty("creatednum");
        _creatednum = creatednum;
    }

    /**
     * [get] REPRINTEDFLG: {varchar(30)} <br>
     * @return The value of the column 'REPRINTEDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getReprintedflg() {
        checkSpecifiedProperty("reprintedflg");
        return convertEmptyToNull(_reprintedflg);
    }

    /**
     * [set] REPRINTEDFLG: {varchar(30)} <br>
     * @param reprintedflg The value of the column 'REPRINTEDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReprintedflg(String reprintedflg) {
        registerModifiedProperty("reprintedflg");
        _reprintedflg = reprintedflg;
    }

    /**
     * [get] VA_EXTDATA1: {varchar(30)} <br>
     * @return The value of the column 'VA_EXTDATA1'. (NullAllowed even if selected: for no constraint)
     */
    public String getVaExtdata1() {
        checkSpecifiedProperty("vaExtdata1");
        return convertEmptyToNull(_vaExtdata1);
    }

    /**
     * [set] VA_EXTDATA1: {varchar(30)} <br>
     * @param vaExtdata1 The value of the column 'VA_EXTDATA1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVaExtdata1(String vaExtdata1) {
        registerModifiedProperty("vaExtdata1");
        _vaExtdata1 = vaExtdata1;
    }

    /**
     * [get] VERSION_NO: {bigint(19)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {bigint(19)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
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

    /**
     * [get] CENTER_ID: {bigint(19)} <br>
     * @return The value of the column 'CENTER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCenterId() {
        checkSpecifiedProperty("centerId");
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {bigint(19)} <br>
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCenterId(Long centerId) {
        registerModifiedProperty("centerId");
        _centerId = centerId;
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
     * [get] CLIENT_ID: {bigint(19)} <br>
     * @return The value of the column 'CLIENT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getClientId() {
        checkSpecifiedProperty("clientId");
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {bigint(19)} <br>
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientId(Long clientId) {
        registerModifiedProperty("clientId");
        _clientId = clientId;
    }

    /**
     * [get] CLIENT_NM: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(60)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }
}
