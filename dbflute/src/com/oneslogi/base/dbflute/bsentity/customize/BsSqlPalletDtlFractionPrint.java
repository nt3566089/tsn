package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlPalletDtlFractionPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSOLISTKEY, SHIPSCHDATE, FAX1, CARRIERSNAME, RMANO, OWNERSONO, LOT2, LOT4, OTHERLOT3, LOT3, SOPALLETNO, IFITEMCD, LOT1, LOT4_CNT, LOT1_CNT, EXPECT_CASE_QTY, EXPECT_CARTON_QTY, OTHERLOT3_CNT, CENTER_ABBR, CUSTOMER_ABBR, PRODUCT_CD, PRODUCT_ABBR, OTHERREFNO1, PRICE2, USERNUM3, TRANSPORTPRIORITY
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
 * Long trsolistkey = entity.getTrsolistkey();
 * String shipschdate = entity.getShipschdate();
 * String fax1 = entity.getFax1();
 * String carriersname = entity.getCarriersname();
 * String rmano = entity.getRmano();
 * String ownersono = entity.getOwnersono();
 * String lot2 = entity.getLot2();
 * String lot4 = entity.getLot4();
 * String otherlot3 = entity.getOtherlot3();
 * String lot3 = entity.getLot3();
 * String sopalletno = entity.getSopalletno();
 * String ifitemcd = entity.getIfitemcd();
 * String lot1 = entity.getLot1();
 * Integer lot4Cnt = entity.getLot4Cnt();
 * Integer lot1Cnt = entity.getLot1Cnt();
 * java.math.BigDecimal expectCaseQty = entity.getExpectCaseQty();
 * java.math.BigDecimal expectCartonQty = entity.getExpectCartonQty();
 * Integer otherlot3Cnt = entity.getOtherlot3Cnt();
 * String centerAbbr = entity.getCenterAbbr();
 * String customerAbbr = entity.getCustomerAbbr();
 * String productCd = entity.getProductCd();
 * String productAbbr = entity.getProductAbbr();
 * String otherrefno1 = entity.getOtherrefno1();
 * java.math.BigDecimal price2 = entity.getPrice2();
 * Long usernum3 = entity.getUsernum3();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * entity.setTrsolistkey(trsolistkey);
 * entity.setShipschdate(shipschdate);
 * entity.setFax1(fax1);
 * entity.setCarriersname(carriersname);
 * entity.setRmano(rmano);
 * entity.setOwnersono(ownersono);
 * entity.setLot2(lot2);
 * entity.setLot4(lot4);
 * entity.setOtherlot3(otherlot3);
 * entity.setLot3(lot3);
 * entity.setSopalletno(sopalletno);
 * entity.setIfitemcd(ifitemcd);
 * entity.setLot1(lot1);
 * entity.setLot4Cnt(lot4Cnt);
 * entity.setLot1Cnt(lot1Cnt);
 * entity.setExpectCaseQty(expectCaseQty);
 * entity.setExpectCartonQty(expectCartonQty);
 * entity.setOtherlot3Cnt(otherlot3Cnt);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setCustomerAbbr(customerAbbr);
 * entity.setProductCd(productCd);
 * entity.setProductAbbr(productAbbr);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setPrice2(price2);
 * entity.setUsernum3(usernum3);
 * entity.setTransportpriority(transportpriority);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPalletDtlFractionPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSOLISTKEY: {bigint(19)} */
    protected Long _trsolistkey;

    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** CARRIERSNAME: {varchar(100)} */
    protected String _carriersname;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** OTHERLOT3: {varchar(60)} */
    protected String _otherlot3;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** SOPALLETNO: {varchar(30)} */
    protected String _sopalletno;

    /** IFITEMCD: {varchar(30)} */
    protected String _ifitemcd;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT4_CNT: {int(10)} */
    protected Integer _lot4Cnt;

    /** LOT1_CNT: {int(10)} */
    protected Integer _lot1Cnt;

    /** EXPECT_CASE_QTY: {decimal(18)} */
    protected java.math.BigDecimal _expectCaseQty;

    /** EXPECT_CARTON_QTY: {decimal(18)} */
    protected java.math.BigDecimal _expectCartonQty;

    /** OTHERLOT3_CNT: {int(10)} */
    protected Integer _otherlot3Cnt;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** CUSTOMER_ABBR: {varchar(60)} */
    protected String _customerAbbr;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** OTHERREFNO1: {varchar(100)} */
    protected String _otherrefno1;

    /** PRICE2: {decimal(16, 6)} */
    protected java.math.BigDecimal _price2;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _transportpriority;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPalletDtlFractionPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPalletDtlFractionPrint";
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
        if (obj instanceof BsSqlPalletDtlFractionPrint) {
            BsSqlPalletDtlFractionPrint other = (BsSqlPalletDtlFractionPrint)obj;
            if (!xSV(_trsolistkey, other._trsolistkey)) { return false; }
            if (!xSV(_shipschdate, other._shipschdate)) { return false; }
            if (!xSV(_fax1, other._fax1)) { return false; }
            if (!xSV(_carriersname, other._carriersname)) { return false; }
            if (!xSV(_rmano, other._rmano)) { return false; }
            if (!xSV(_ownersono, other._ownersono)) { return false; }
            if (!xSV(_lot2, other._lot2)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_otherlot3, other._otherlot3)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_sopalletno, other._sopalletno)) { return false; }
            if (!xSV(_ifitemcd, other._ifitemcd)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot4Cnt, other._lot4Cnt)) { return false; }
            if (!xSV(_lot1Cnt, other._lot1Cnt)) { return false; }
            if (!xSV(_expectCaseQty, other._expectCaseQty)) { return false; }
            if (!xSV(_expectCartonQty, other._expectCartonQty)) { return false; }
            if (!xSV(_otherlot3Cnt, other._otherlot3Cnt)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_customerAbbr, other._customerAbbr)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_otherrefno1, other._otherrefno1)) { return false; }
            if (!xSV(_price2, other._price2)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_transportpriority, other._transportpriority)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsolistkey);
        hs = xCH(hs, _shipschdate);
        hs = xCH(hs, _fax1);
        hs = xCH(hs, _carriersname);
        hs = xCH(hs, _rmano);
        hs = xCH(hs, _ownersono);
        hs = xCH(hs, _lot2);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _otherlot3);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _sopalletno);
        hs = xCH(hs, _ifitemcd);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot4Cnt);
        hs = xCH(hs, _lot1Cnt);
        hs = xCH(hs, _expectCaseQty);
        hs = xCH(hs, _expectCartonQty);
        hs = xCH(hs, _otherlot3Cnt);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _customerAbbr);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _otherrefno1);
        hs = xCH(hs, _price2);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _transportpriority);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsolistkey));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_otherlot3));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4Cnt));
        sb.append(dm).append(xfND(_lot1Cnt));
        sb.append(dm).append(xfND(_expectCaseQty));
        sb.append(dm).append(xfND(_expectCartonQty));
        sb.append(dm).append(xfND(_otherlot3Cnt));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_customerAbbr));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_price2));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_transportpriority));
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
    public SqlPalletDtlFractionPrint clone() {
        return (SqlPalletDtlFractionPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSOLISTKEY: {bigint(19)} <br>
     * @return The value of the column 'TRSOLISTKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsolistkey() {
        checkSpecifiedProperty("trsolistkey");
        return _trsolistkey;
    }

    /**
     * [set] TRSOLISTKEY: {bigint(19)} <br>
     * @param trsolistkey The value of the column 'TRSOLISTKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsolistkey(Long trsolistkey) {
        registerModifiedProperty("trsolistkey");
        _trsolistkey = trsolistkey;
    }

    /**
     * [get] SHIPSCHDATE: {varchar(8)} <br>
     * @return The value of the column 'SHIPSCHDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getShipschdate() {
        checkSpecifiedProperty("shipschdate");
        return convertEmptyToNull(_shipschdate);
    }

    /**
     * [set] SHIPSCHDATE: {varchar(8)} <br>
     * @param shipschdate The value of the column 'SHIPSCHDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShipschdate(String shipschdate) {
        registerModifiedProperty("shipschdate");
        _shipschdate = shipschdate;
    }

    /**
     * [get] FAX1: {varchar(60)} <br>
     * @return The value of the column 'FAX1'. (NullAllowed even if selected: for no constraint)
     */
    public String getFax1() {
        checkSpecifiedProperty("fax1");
        return convertEmptyToNull(_fax1);
    }

    /**
     * [set] FAX1: {varchar(60)} <br>
     * @param fax1 The value of the column 'FAX1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFax1(String fax1) {
        registerModifiedProperty("fax1");
        _fax1 = fax1;
    }

    /**
     * [get] CARRIERSNAME: {varchar(100)} <br>
     * @return The value of the column 'CARRIERSNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getCarriersname() {
        checkSpecifiedProperty("carriersname");
        return convertEmptyToNull(_carriersname);
    }

    /**
     * [set] CARRIERSNAME: {varchar(100)} <br>
     * @param carriersname The value of the column 'CARRIERSNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCarriersname(String carriersname) {
        registerModifiedProperty("carriersname");
        _carriersname = carriersname;
    }

    /**
     * [get] RMANO: {varchar(60)} <br>
     * @return The value of the column 'RMANO'. (NullAllowed even if selected: for no constraint)
     */
    public String getRmano() {
        checkSpecifiedProperty("rmano");
        return convertEmptyToNull(_rmano);
    }

    /**
     * [set] RMANO: {varchar(60)} <br>
     * @param rmano The value of the column 'RMANO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRmano(String rmano) {
        registerModifiedProperty("rmano");
        _rmano = rmano;
    }

    /**
     * [get] OWNERSONO: {varchar(60)} <br>
     * @return The value of the column 'OWNERSONO'. (NullAllowed even if selected: for no constraint)
     */
    public String getOwnersono() {
        checkSpecifiedProperty("ownersono");
        return convertEmptyToNull(_ownersono);
    }

    /**
     * [set] OWNERSONO: {varchar(60)} <br>
     * @param ownersono The value of the column 'OWNERSONO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOwnersono(String ownersono) {
        registerModifiedProperty("ownersono");
        _ownersono = ownersono;
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
     * [get] OTHERLOT3: {varchar(60)} <br>
     * @return The value of the column 'OTHERLOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherlot3() {
        checkSpecifiedProperty("otherlot3");
        return convertEmptyToNull(_otherlot3);
    }

    /**
     * [set] OTHERLOT3: {varchar(60)} <br>
     * @param otherlot3 The value of the column 'OTHERLOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot3(String otherlot3) {
        registerModifiedProperty("otherlot3");
        _otherlot3 = otherlot3;
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
     * [get] SOPALLETNO: {varchar(30)} <br>
     * @return The value of the column 'SOPALLETNO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSopalletno() {
        checkSpecifiedProperty("sopalletno");
        return convertEmptyToNull(_sopalletno);
    }

    /**
     * [set] SOPALLETNO: {varchar(30)} <br>
     * @param sopalletno The value of the column 'SOPALLETNO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSopalletno(String sopalletno) {
        registerModifiedProperty("sopalletno");
        _sopalletno = sopalletno;
    }

    /**
     * [get] IFITEMCD: {varchar(30)} <br>
     * @return The value of the column 'IFITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getIfitemcd() {
        checkSpecifiedProperty("ifitemcd");
        return convertEmptyToNull(_ifitemcd);
    }

    /**
     * [set] IFITEMCD: {varchar(30)} <br>
     * @param ifitemcd The value of the column 'IFITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setIfitemcd(String ifitemcd) {
        registerModifiedProperty("ifitemcd");
        _ifitemcd = ifitemcd;
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
     * [get] LOT4_CNT: {int(10)} <br>
     * @return The value of the column 'LOT4_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getLot4Cnt() {
        checkSpecifiedProperty("lot4Cnt");
        return _lot4Cnt;
    }

    /**
     * [set] LOT4_CNT: {int(10)} <br>
     * @param lot4Cnt The value of the column 'LOT4_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot4Cnt(Integer lot4Cnt) {
        registerModifiedProperty("lot4Cnt");
        _lot4Cnt = lot4Cnt;
    }

    /**
     * [get] LOT1_CNT: {int(10)} <br>
     * @return The value of the column 'LOT1_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getLot1Cnt() {
        checkSpecifiedProperty("lot1Cnt");
        return _lot1Cnt;
    }

    /**
     * [set] LOT1_CNT: {int(10)} <br>
     * @param lot1Cnt The value of the column 'LOT1_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1Cnt(Integer lot1Cnt) {
        registerModifiedProperty("lot1Cnt");
        _lot1Cnt = lot1Cnt;
    }

    /**
     * [get] EXPECT_CASE_QTY: {decimal(18)} <br>
     * @return The value of the column 'EXPECT_CASE_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectCaseQty() {
        checkSpecifiedProperty("expectCaseQty");
        return _expectCaseQty;
    }

    /**
     * [set] EXPECT_CASE_QTY: {decimal(18)} <br>
     * @param expectCaseQty The value of the column 'EXPECT_CASE_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectCaseQty(java.math.BigDecimal expectCaseQty) {
        registerModifiedProperty("expectCaseQty");
        _expectCaseQty = expectCaseQty;
    }

    /**
     * [get] EXPECT_CARTON_QTY: {decimal(18)} <br>
     * @return The value of the column 'EXPECT_CARTON_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectCartonQty() {
        checkSpecifiedProperty("expectCartonQty");
        return _expectCartonQty;
    }

    /**
     * [set] EXPECT_CARTON_QTY: {decimal(18)} <br>
     * @param expectCartonQty The value of the column 'EXPECT_CARTON_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectCartonQty(java.math.BigDecimal expectCartonQty) {
        registerModifiedProperty("expectCartonQty");
        _expectCartonQty = expectCartonQty;
    }

    /**
     * [get] OTHERLOT3_CNT: {int(10)} <br>
     * @return The value of the column 'OTHERLOT3_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOtherlot3Cnt() {
        checkSpecifiedProperty("otherlot3Cnt");
        return _otherlot3Cnt;
    }

    /**
     * [set] OTHERLOT3_CNT: {int(10)} <br>
     * @param otherlot3Cnt The value of the column 'OTHERLOT3_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot3Cnt(Integer otherlot3Cnt) {
        registerModifiedProperty("otherlot3Cnt");
        _otherlot3Cnt = otherlot3Cnt;
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
     * [get] CUSTOMER_ABBR: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_ABBR'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerAbbr() {
        checkSpecifiedProperty("customerAbbr");
        return convertEmptyToNull(_customerAbbr);
    }

    /**
     * [set] CUSTOMER_ABBR: {varchar(60)} <br>
     * @param customerAbbr The value of the column 'CUSTOMER_ABBR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerAbbr(String customerAbbr) {
        registerModifiedProperty("customerAbbr");
        _customerAbbr = customerAbbr;
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
     * [get] OTHERREFNO1: {varchar(100)} <br>
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(100)} <br>
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] PRICE2: {decimal(16, 6)} <br>
     * @return The value of the column 'PRICE2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getPrice2() {
        checkSpecifiedProperty("price2");
        return _price2;
    }

    /**
     * [set] PRICE2: {decimal(16, 6)} <br>
     * @param price2 The value of the column 'PRICE2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrice2(java.math.BigDecimal price2) {
        registerModifiedProperty("price2");
        _price2 = price2;
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
     * [get] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @return The value of the column 'TRANSPORTPRIORITY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTransportpriority() {
        checkSpecifiedProperty("transportpriority");
        return _transportpriority;
    }

    /**
     * [set] TRANSPORTPRIORITY: {decimal(16, 6)} <br>
     * @param transportpriority The value of the column 'TRANSPORTPRIORITY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTransportpriority(java.math.BigDecimal transportpriority) {
        registerModifiedProperty("transportpriority");
        _transportpriority = transportpriority;
    }
}
