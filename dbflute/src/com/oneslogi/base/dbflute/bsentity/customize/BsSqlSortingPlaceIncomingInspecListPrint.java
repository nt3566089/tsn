package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlSortingPlaceIncomingInspecListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, WORKALLOCATEID, OTHERLOT1, LOT1, LOT2, LOT3, LOT4, FLOOR, PRODUCT_CD, CLIENT_NM, LISTKBN, PICK_CASE_QTY, PICK_CARTON_QTY, CASE_EXPECT_QTY, CARTON_EXPECT_QTY, PALLET_EXPECT_QTY, MIN_SHIPSCHDATE, MAX_SHIPSCHDATE, CENTER_ABBR, PRODUCT_ABBR, USERNUM3, OTHERCD3, USER_CD, USER_NM
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
 * Long workallocateid = entity.getWorkallocateid();
 * String otherlot1 = entity.getOtherlot1();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot3 = entity.getLot3();
 * String lot4 = entity.getLot4();
 * String floor = entity.getFloor();
 * String productCd = entity.getProductCd();
 * String clientNm = entity.getClientNm();
 * String listkbn = entity.getListkbn();
 * java.math.BigDecimal pickCaseQty = entity.getPickCaseQty();
 * java.math.BigDecimal pickCartonQty = entity.getPickCartonQty();
 * java.math.BigDecimal caseExpectQty = entity.getCaseExpectQty();
 * java.math.BigDecimal cartonExpectQty = entity.getCartonExpectQty();
 * java.math.BigDecimal palletExpectQty = entity.getPalletExpectQty();
 * String minShipschdate = entity.getMinShipschdate();
 * String maxShipschdate = entity.getMaxShipschdate();
 * String centerAbbr = entity.getCenterAbbr();
 * String productAbbr = entity.getProductAbbr();
 * Long usernum3 = entity.getUsernum3();
 * String othercd3 = entity.getOthercd3();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * entity.setCenterCd(centerCd);
 * entity.setWorkallocateid(workallocateid);
 * entity.setOtherlot1(otherlot1);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot3(lot3);
 * entity.setLot4(lot4);
 * entity.setFloor(floor);
 * entity.setProductCd(productCd);
 * entity.setClientNm(clientNm);
 * entity.setListkbn(listkbn);
 * entity.setPickCaseQty(pickCaseQty);
 * entity.setPickCartonQty(pickCartonQty);
 * entity.setCaseExpectQty(caseExpectQty);
 * entity.setCartonExpectQty(cartonExpectQty);
 * entity.setPalletExpectQty(palletExpectQty);
 * entity.setMinShipschdate(minShipschdate);
 * entity.setMaxShipschdate(maxShipschdate);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setProductAbbr(productAbbr);
 * entity.setUsernum3(usernum3);
 * entity.setOthercd3(othercd3);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlSortingPlaceIncomingInspecListPrint extends AbstractEntity implements CustomizeEntity {

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

    /** WORKALLOCATEID: {bigint(19)} */
    protected Long _workallocateid;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** FLOOR: {varchar(30)} */
    protected String _floor;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** CLIENT_NM: {varchar(3)} */
    protected String _clientNm;

    /** LISTKBN: {char(1)} */
    protected String _listkbn;

    /** PICK_CASE_QTY: {decimal(37, 6)} */
    protected java.math.BigDecimal _pickCaseQty;

    /** PICK_CARTON_QTY: {bigint(19)} */
    protected java.math.BigDecimal _pickCartonQty;

    /** CASE_EXPECT_QTY: {bigint(19)} */
    protected java.math.BigDecimal _caseExpectQty;

    /** CARTON_EXPECT_QTY: {bigint(19)} */
    protected java.math.BigDecimal _cartonExpectQty;

    /** PALLET_EXPECT_QTY: {bigint(19)} */
    protected java.math.BigDecimal _palletExpectQty;

    /** MIN_SHIPSCHDATE: {varchar(8)} */
    protected String _minShipschdate;

    /** MAX_SHIPSCHDATE: {varchar(8)} */
    protected String _maxShipschdate;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** OTHERCD3: {varchar(30)} */
    protected String _othercd3;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlSortingPlaceIncomingInspecListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlSortingPlaceIncomingInspecListPrint";
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
        if (obj instanceof BsSqlSortingPlaceIncomingInspecListPrint) {
            BsSqlSortingPlaceIncomingInspecListPrint other = (BsSqlSortingPlaceIncomingInspecListPrint)obj;
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_otherlot1, other._otherlot1)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot2, other._lot2)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_floor, other._floor)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_listkbn, other._listkbn)) { return false; }
            if (!xSV(_pickCaseQty, other._pickCaseQty)) { return false; }
            if (!xSV(_pickCartonQty, other._pickCartonQty)) { return false; }
            if (!xSV(_caseExpectQty, other._caseExpectQty)) { return false; }
            if (!xSV(_cartonExpectQty, other._cartonExpectQty)) { return false; }
            if (!xSV(_palletExpectQty, other._palletExpectQty)) { return false; }
            if (!xSV(_minShipschdate, other._minShipschdate)) { return false; }
            if (!xSV(_maxShipschdate, other._maxShipschdate)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_othercd3, other._othercd3)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
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
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _otherlot1);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot2);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _floor);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _listkbn);
        hs = xCH(hs, _pickCaseQty);
        hs = xCH(hs, _pickCartonQty);
        hs = xCH(hs, _caseExpectQty);
        hs = xCH(hs, _cartonExpectQty);
        hs = xCH(hs, _palletExpectQty);
        hs = xCH(hs, _minShipschdate);
        hs = xCH(hs, _maxShipschdate);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _othercd3);
        hs = xCH(hs, _userCd);
        hs = xCH(hs, _userNm);
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
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_pickCaseQty));
        sb.append(dm).append(xfND(_pickCartonQty));
        sb.append(dm).append(xfND(_caseExpectQty));
        sb.append(dm).append(xfND(_cartonExpectQty));
        sb.append(dm).append(xfND(_palletExpectQty));
        sb.append(dm).append(xfND(_minShipschdate));
        sb.append(dm).append(xfND(_maxShipschdate));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_othercd3));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
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
    public SqlSortingPlaceIncomingInspecListPrint clone() {
        return (SqlSortingPlaceIncomingInspecListPrint)super.clone();
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
     * [get] WORKALLOCATEID: {bigint(19)} <br>
     * @return The value of the column 'WORKALLOCATEID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getWorkallocateid() {
        checkSpecifiedProperty("workallocateid");
        return _workallocateid;
    }

    /**
     * [set] WORKALLOCATEID: {bigint(19)} <br>
     * @param workallocateid The value of the column 'WORKALLOCATEID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWorkallocateid(Long workallocateid) {
        registerModifiedProperty("workallocateid");
        _workallocateid = workallocateid;
    }

    /**
     * [get] OTHERLOT1: {varchar(60)} <br>
     * @return The value of the column 'OTHERLOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot1() {
        checkSpecifiedProperty("otherlot1");
        return convertEmptyToNull(_otherlot1);
    }

    /**
     * [set] OTHERLOT1: {varchar(60)} <br>
     * @param otherlot1 The value of the column 'OTHERLOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot1(String otherlot1) {
        registerModifiedProperty("otherlot1");
        _otherlot1 = otherlot1;
    }

    /**
     * [get] LOT1: {varchar(60)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(60)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
    }

    /**
     * [get] LOT2: {varchar(60)} <br>
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(60)} <br>
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
    }

    /**
     * [get] LOT3: {varchar(60)} <br>
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(60)} <br>
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT4: {varchar(8)} <br>
     * @return The value of the column 'LOT4'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot4() {
        checkSpecifiedProperty("lot4");
        return convertEmptyToNull(_lot4);
    }

    /**
     * [set] LOT4: {varchar(8)} <br>
     * @param lot4 The value of the column 'LOT4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4(String lot4) {
        registerModifiedProperty("lot4");
        _lot4 = lot4;
    }

    /**
     * [get] FLOOR: {varchar(30)} <br>
     * @return The value of the column 'FLOOR'. (NullAllowed even if selected: for no constraint)
     */
    public String getFloor() {
        checkSpecifiedProperty("floor");
        return convertEmptyToNull(_floor);
    }

    /**
     * [set] FLOOR: {varchar(30)} <br>
     * @param floor The value of the column 'FLOOR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloor(String floor) {
        registerModifiedProperty("floor");
        _floor = floor;
    }

    /**
     * [get] PRODUCT_CD: {varchar(100)} <br>
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductCd() {
        checkSpecifiedProperty("productCd");
        return convertEmptyToNull(_productCd);
    }

    /**
     * [set] PRODUCT_CD: {varchar(100)} <br>
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductCd(String productCd) {
        registerModifiedProperty("productCd");
        _productCd = productCd;
    }

    /**
     * [get] CLIENT_NM: {varchar(3)} <br>
     * @return The value of the column 'CLIENT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientNm() {
        checkSpecifiedProperty("clientNm");
        return convertEmptyToNull(_clientNm);
    }

    /**
     * [set] CLIENT_NM: {varchar(3)} <br>
     * @param clientNm The value of the column 'CLIENT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientNm(String clientNm) {
        registerModifiedProperty("clientNm");
        _clientNm = clientNm;
    }

    /**
     * [get] LISTKBN: {char(1)} <br>
     * @return The value of the column 'LISTKBN'. (NullAllowed even if selected: for no constraint)
     */
    public String getListkbn() {
        checkSpecifiedProperty("listkbn");
        return convertEmptyToNull(_listkbn);
    }

    /**
     * [set] LISTKBN: {char(1)} <br>
     * @param listkbn The value of the column 'LISTKBN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setListkbn(String listkbn) {
        registerModifiedProperty("listkbn");
        _listkbn = listkbn;
    }

    /**
     * [get] PICK_CASE_QTY: {decimal(37, 6)} <br>
     * @return The value of the column 'PICK_CASE_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickCaseQty() {
        checkSpecifiedProperty("pickCaseQty");
        return _pickCaseQty;
    }

    /**
     * [set] PICK_CASE_QTY: {decimal(37, 6)} <br>
     * @param pickCaseQty The value of the column 'PICK_CASE_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickCaseQty(java.math.BigDecimal pickCaseQty) {
        registerModifiedProperty("pickCaseQty");
        _pickCaseQty = pickCaseQty;
    }

    /**
     * [get] PICK_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICK_CARTON_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickCartonQty() {
        checkSpecifiedProperty("pickCartonQty");
        return _pickCartonQty;
    }

    /**
     * [set] PICK_CARTON_QTY: {bigint(19)} <br>
     * @param pickCartonQty The value of the column 'PICK_CARTON_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickCartonQty(java.math.BigDecimal pickCartonQty) {
        registerModifiedProperty("pickCartonQty");
        _pickCartonQty = pickCartonQty;
    }

    /**
     * [get] CASE_EXPECT_QTY: {bigint(19)} <br>
     * @return The value of the column 'CASE_EXPECT_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCaseExpectQty() {
        checkSpecifiedProperty("caseExpectQty");
        return _caseExpectQty;
    }

    /**
     * [set] CASE_EXPECT_QTY: {bigint(19)} <br>
     * @param caseExpectQty The value of the column 'CASE_EXPECT_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseExpectQty(java.math.BigDecimal caseExpectQty) {
        registerModifiedProperty("caseExpectQty");
        _caseExpectQty = caseExpectQty;
    }

    /**
     * [get] CARTON_EXPECT_QTY: {bigint(19)} <br>
     * @return The value of the column 'CARTON_EXPECT_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCartonExpectQty() {
        checkSpecifiedProperty("cartonExpectQty");
        return _cartonExpectQty;
    }

    /**
     * [set] CARTON_EXPECT_QTY: {bigint(19)} <br>
     * @param cartonExpectQty The value of the column 'CARTON_EXPECT_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCartonExpectQty(java.math.BigDecimal cartonExpectQty) {
        registerModifiedProperty("cartonExpectQty");
        _cartonExpectQty = cartonExpectQty;
    }

    /**
     * [get] PALLET_EXPECT_QTY: {bigint(19)} <br>
     * @return The value of the column 'PALLET_EXPECT_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPalletExpectQty() {
        checkSpecifiedProperty("palletExpectQty");
        return _palletExpectQty;
    }

    /**
     * [set] PALLET_EXPECT_QTY: {bigint(19)} <br>
     * @param palletExpectQty The value of the column 'PALLET_EXPECT_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletExpectQty(java.math.BigDecimal palletExpectQty) {
        registerModifiedProperty("palletExpectQty");
        _palletExpectQty = palletExpectQty;
    }

    /**
     * [get] MIN_SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'MIN_SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMinShipschdate() {
        checkSpecifiedProperty("minShipschdate");
        return convertEmptyToNull(_minShipschdate);
    }

    /**
     * [set] MIN_SHIPSCHDATE: {varchar(8)} <br>
     * @param minShipschdate The value of the column 'MIN_SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMinShipschdate(String minShipschdate) {
        registerModifiedProperty("minShipschdate");
        _minShipschdate = minShipschdate;
    }

    /**
     * [get] MAX_SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'MAX_SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getMaxShipschdate() {
        checkSpecifiedProperty("maxShipschdate");
        return convertEmptyToNull(_maxShipschdate);
    }

    /**
     * [set] MAX_SHIPSCHDATE: {varchar(8)} <br>
     * @param maxShipschdate The value of the column 'MAX_SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMaxShipschdate(String maxShipschdate) {
        registerModifiedProperty("maxShipschdate");
        _maxShipschdate = maxShipschdate;
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
     * [get] OTHERCD3: {varchar(30)} <br>
     * @return The value of the column 'OTHERCD3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOthercd3() {
        checkSpecifiedProperty("othercd3");
        return convertEmptyToNull(_othercd3);
    }

    /**
     * [set] OTHERCD3: {varchar(30)} <br>
     * @param othercd3 The value of the column 'OTHERCD3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOthercd3(String othercd3) {
        registerModifiedProperty("othercd3");
        _othercd3 = othercd3;
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
}
