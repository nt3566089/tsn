package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlBondedPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     FLOOR, WORKALLOCATEID, LOT3, OTHERLOT1, LOT1, LOT2, LOT4, LISTKBN, PALLET_QTY, CASE_QTY, SORT_RECEIVED_CASE_QTY, SORT_RECEIVED_CARTON_QTY, PICKED_PALLET_QTY, PICKED_CASE_QTY, PICKED_CARTON_QTY, CLIENT_NM, MIN_SHIPSCHDATE, MAX_SHIPSCHDATE, CENTER_CD, CENTER_ABBR, CLIENT_ABBR, PRODUCT_CD, PRODUCT_ABBR, USERNUM3, OTHERCD3, USER_CD, USER_NM, LOCATION_CD
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
 * String floor = entity.getFloor();
 * Long workallocateid = entity.getWorkallocateid();
 * String lot3 = entity.getLot3();
 * String otherlot1 = entity.getOtherlot1();
 * String lot1 = entity.getLot1();
 * String lot2 = entity.getLot2();
 * String lot4 = entity.getLot4();
 * String listkbn = entity.getListkbn();
 * java.math.BigDecimal palletQty = entity.getPalletQty();
 * java.math.BigDecimal caseQty = entity.getCaseQty();
 * java.math.BigDecimal sortReceivedCaseQty = entity.getSortReceivedCaseQty();
 * java.math.BigDecimal sortReceivedCartonQty = entity.getSortReceivedCartonQty();
 * java.math.BigDecimal pickedPalletQty = entity.getPickedPalletQty();
 * java.math.BigDecimal pickedCaseQty = entity.getPickedCaseQty();
 * java.math.BigDecimal pickedCartonQty = entity.getPickedCartonQty();
 * String clientNm = entity.getClientNm();
 * String minShipschdate = entity.getMinShipschdate();
 * String maxShipschdate = entity.getMaxShipschdate();
 * String centerCd = entity.getCenterCd();
 * String centerAbbr = entity.getCenterAbbr();
 * String clientAbbr = entity.getClientAbbr();
 * String productCd = entity.getProductCd();
 * String productAbbr = entity.getProductAbbr();
 * Long usernum3 = entity.getUsernum3();
 * String othercd3 = entity.getOthercd3();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * String locationCd = entity.getLocationCd();
 * entity.setFloor(floor);
 * entity.setWorkallocateid(workallocateid);
 * entity.setLot3(lot3);
 * entity.setOtherlot1(otherlot1);
 * entity.setLot1(lot1);
 * entity.setLot2(lot2);
 * entity.setLot4(lot4);
 * entity.setListkbn(listkbn);
 * entity.setPalletQty(palletQty);
 * entity.setCaseQty(caseQty);
 * entity.setSortReceivedCaseQty(sortReceivedCaseQty);
 * entity.setSortReceivedCartonQty(sortReceivedCartonQty);
 * entity.setPickedPalletQty(pickedPalletQty);
 * entity.setPickedCaseQty(pickedCaseQty);
 * entity.setPickedCartonQty(pickedCartonQty);
 * entity.setClientNm(clientNm);
 * entity.setMinShipschdate(minShipschdate);
 * entity.setMaxShipschdate(maxShipschdate);
 * entity.setCenterCd(centerCd);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setClientAbbr(clientAbbr);
 * entity.setProductCd(productCd);
 * entity.setProductAbbr(productAbbr);
 * entity.setUsernum3(usernum3);
 * entity.setOthercd3(othercd3);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * entity.setLocationCd(locationCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlBondedPickingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FLOOR: {varchar(30)} */
    protected String _floor;

    /** WORKALLOCATEID: {bigint(19)} */
    protected Long _workallocateid;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** OTHERLOT1: {varchar(60)} */
    protected String _otherlot1;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LISTKBN: {char(1)} */
    protected String _listkbn;

    /** PALLET_QTY: {bigint(19)} */
    protected java.math.BigDecimal _palletQty;

    /** CASE_QTY: {decimal(36, 6)} */
    protected java.math.BigDecimal _caseQty;

    /** SORT_RECEIVED_CASE_QTY: {decimal(37, 6)} */
    protected java.math.BigDecimal _sortReceivedCaseQty;

    /** SORT_RECEIVED_CARTON_QTY: {bigint(19)} */
    protected java.math.BigDecimal _sortReceivedCartonQty;

    /** PICKED_PALLET_QTY: {bigint(19)} */
    protected java.math.BigDecimal _pickedPalletQty;

    /** PICKED_CASE_QTY: {bigint(19)} */
    protected java.math.BigDecimal _pickedCaseQty;

    /** PICKED_CARTON_QTY: {bigint(19)} */
    protected java.math.BigDecimal _pickedCartonQty;

    /** CLIENT_NM: {varchar(3)} */
    protected String _clientNm;

    /** MIN_SHIPSCHDATE: {varchar(8)} */
    protected String _minShipschdate;

    /** MAX_SHIPSCHDATE: {varchar(8)} */
    protected String _maxShipschdate;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** CLIENT_ABBR: {varchar(60)} */
    protected String _clientAbbr;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

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

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlBondedPickingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlBondedPickingListPrint";
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
        if (obj instanceof BsSqlBondedPickingListPrint) {
            BsSqlBondedPickingListPrint other = (BsSqlBondedPickingListPrint)obj;
            if (!xSV(_floor, other._floor)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_otherlot1, other._otherlot1)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot2, other._lot2)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_listkbn, other._listkbn)) { return false; }
            if (!xSV(_palletQty, other._palletQty)) { return false; }
            if (!xSV(_caseQty, other._caseQty)) { return false; }
            if (!xSV(_sortReceivedCaseQty, other._sortReceivedCaseQty)) { return false; }
            if (!xSV(_sortReceivedCartonQty, other._sortReceivedCartonQty)) { return false; }
            if (!xSV(_pickedPalletQty, other._pickedPalletQty)) { return false; }
            if (!xSV(_pickedCaseQty, other._pickedCaseQty)) { return false; }
            if (!xSV(_pickedCartonQty, other._pickedCartonQty)) { return false; }
            if (!xSV(_clientNm, other._clientNm)) { return false; }
            if (!xSV(_minShipschdate, other._minShipschdate)) { return false; }
            if (!xSV(_maxShipschdate, other._maxShipschdate)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_clientAbbr, other._clientAbbr)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_othercd3, other._othercd3)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _floor);
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _otherlot1);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot2);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _listkbn);
        hs = xCH(hs, _palletQty);
        hs = xCH(hs, _caseQty);
        hs = xCH(hs, _sortReceivedCaseQty);
        hs = xCH(hs, _sortReceivedCartonQty);
        hs = xCH(hs, _pickedPalletQty);
        hs = xCH(hs, _pickedCaseQty);
        hs = xCH(hs, _pickedCartonQty);
        hs = xCH(hs, _clientNm);
        hs = xCH(hs, _minShipschdate);
        hs = xCH(hs, _maxShipschdate);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _clientAbbr);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _othercd3);
        hs = xCH(hs, _userCd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _locationCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_floor));
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_otherlot1));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_listkbn));
        sb.append(dm).append(xfND(_palletQty));
        sb.append(dm).append(xfND(_caseQty));
        sb.append(dm).append(xfND(_sortReceivedCaseQty));
        sb.append(dm).append(xfND(_sortReceivedCartonQty));
        sb.append(dm).append(xfND(_pickedPalletQty));
        sb.append(dm).append(xfND(_pickedCaseQty));
        sb.append(dm).append(xfND(_pickedCartonQty));
        sb.append(dm).append(xfND(_clientNm));
        sb.append(dm).append(xfND(_minShipschdate));
        sb.append(dm).append(xfND(_maxShipschdate));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_clientAbbr));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_othercd3));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_locationCd));
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
    public SqlBondedPickingListPrint clone() {
        return (SqlBondedPickingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] PALLET_QTY: {bigint(19)} <br>
     * @return The value of the column 'PALLET_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPalletQty() {
        checkSpecifiedProperty("palletQty");
        return _palletQty;
    }

    /**
     * [set] PALLET_QTY: {bigint(19)} <br>
     * @param palletQty The value of the column 'PALLET_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPalletQty(java.math.BigDecimal palletQty) {
        registerModifiedProperty("palletQty");
        _palletQty = palletQty;
    }

    /**
     * [get] CASE_QTY: {decimal(36, 6)} <br>
     * @return The value of the column 'CASE_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCaseQty() {
        checkSpecifiedProperty("caseQty");
        return _caseQty;
    }

    /**
     * [set] CASE_QTY: {decimal(36, 6)} <br>
     * @param caseQty The value of the column 'CASE_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseQty(java.math.BigDecimal caseQty) {
        registerModifiedProperty("caseQty");
        _caseQty = caseQty;
    }

    /**
     * [get] SORT_RECEIVED_CASE_QTY: {decimal(37, 6)} <br>
     * @return The value of the column 'SORT_RECEIVED_CASE_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSortReceivedCaseQty() {
        checkSpecifiedProperty("sortReceivedCaseQty");
        return _sortReceivedCaseQty;
    }

    /**
     * [set] SORT_RECEIVED_CASE_QTY: {decimal(37, 6)} <br>
     * @param sortReceivedCaseQty The value of the column 'SORT_RECEIVED_CASE_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortReceivedCaseQty(java.math.BigDecimal sortReceivedCaseQty) {
        registerModifiedProperty("sortReceivedCaseQty");
        _sortReceivedCaseQty = sortReceivedCaseQty;
    }

    /**
     * [get] SORT_RECEIVED_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'SORT_RECEIVED_CARTON_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSortReceivedCartonQty() {
        checkSpecifiedProperty("sortReceivedCartonQty");
        return _sortReceivedCartonQty;
    }

    /**
     * [set] SORT_RECEIVED_CARTON_QTY: {bigint(19)} <br>
     * @param sortReceivedCartonQty The value of the column 'SORT_RECEIVED_CARTON_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSortReceivedCartonQty(java.math.BigDecimal sortReceivedCartonQty) {
        registerModifiedProperty("sortReceivedCartonQty");
        _sortReceivedCartonQty = sortReceivedCartonQty;
    }

    /**
     * [get] PICKED_PALLET_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICKED_PALLET_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickedPalletQty() {
        checkSpecifiedProperty("pickedPalletQty");
        return _pickedPalletQty;
    }

    /**
     * [set] PICKED_PALLET_QTY: {bigint(19)} <br>
     * @param pickedPalletQty The value of the column 'PICKED_PALLET_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedPalletQty(java.math.BigDecimal pickedPalletQty) {
        registerModifiedProperty("pickedPalletQty");
        _pickedPalletQty = pickedPalletQty;
    }

    /**
     * [get] PICKED_CASE_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICKED_CASE_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickedCaseQty() {
        checkSpecifiedProperty("pickedCaseQty");
        return _pickedCaseQty;
    }

    /**
     * [set] PICKED_CASE_QTY: {bigint(19)} <br>
     * @param pickedCaseQty The value of the column 'PICKED_CASE_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedCaseQty(java.math.BigDecimal pickedCaseQty) {
        registerModifiedProperty("pickedCaseQty");
        _pickedCaseQty = pickedCaseQty;
    }

    /**
     * [get] PICKED_CARTON_QTY: {bigint(19)} <br>
     * @return The value of the column 'PICKED_CARTON_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPickedCartonQty() {
        checkSpecifiedProperty("pickedCartonQty");
        return _pickedCartonQty;
    }

    /**
     * [set] PICKED_CARTON_QTY: {bigint(19)} <br>
     * @param pickedCartonQty The value of the column 'PICKED_CARTON_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPickedCartonQty(java.math.BigDecimal pickedCartonQty) {
        registerModifiedProperty("pickedCartonQty");
        _pickedCartonQty = pickedCartonQty;
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
     * [get] CLIENT_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CLIENT_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientAbbr() {
        checkSpecifiedProperty("clientAbbr");
        return convertEmptyToNull(_clientAbbr);
    }

    /**
     * [set] CLIENT_ABBR: {varchar(60)} <br>
     * @param clientAbbr The value of the column 'CLIENT_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientAbbr(String clientAbbr) {
        registerModifiedProperty("clientAbbr");
        _clientAbbr = clientAbbr;
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

    /**
     * [get] LOCATION_CD: {varchar(30)} <br>
     * @return The value of the column 'LOCATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getLocationCd() {
        checkSpecifiedProperty("locationCd");
        return convertEmptyToNull(_locationCd);
    }

    /**
     * [set] LOCATION_CD: {varchar(30)} <br>
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationCd(String locationCd) {
        registerModifiedProperty("locationCd");
        _locationCd = locationCd;
    }
}
