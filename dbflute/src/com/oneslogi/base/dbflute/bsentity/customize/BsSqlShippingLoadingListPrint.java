package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingLoadingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SHIPSCHDATE, TRSOLISTKEY, CENTER_CD, OWNERSONO, PHONENO, SHIPTOCD, DELIVNAME, CUSTOMER_CD, RMANO, OTHERREFNO1, ORDERTYPE, FAX1, PRICE2, NOTES, PRODUCT_CD, LOT3, LOT1, LOT4, EXPECTQTY1, EXPECTQTY2, CENTER_ABBR, CUSTOMER_ABBR, PRODUCT_ABBR, USERNUM3, USER_CD, USER_NM, OTHERREFNO1_NM, ORDERTYPE_NM, OTHERLOT2_CNT, TRANSPORTPRIORITY
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
 * String shipschdate = entity.getShipschdate();
 * Long trsolistkey = entity.getTrsolistkey();
 * String centerCd = entity.getCenterCd();
 * String ownersono = entity.getOwnersono();
 * String phoneno = entity.getPhoneno();
 * String shiptocd = entity.getShiptocd();
 * String delivname = entity.getDelivname();
 * String customerCd = entity.getCustomerCd();
 * String rmano = entity.getRmano();
 * String otherrefno1 = entity.getOtherrefno1();
 * String ordertype = entity.getOrdertype();
 * String fax1 = entity.getFax1();
 * java.math.BigDecimal price2 = entity.getPrice2();
 * String notes = entity.getNotes();
 * String productCd = entity.getProductCd();
 * String lot3 = entity.getLot3();
 * String lot1 = entity.getLot1();
 * String lot4 = entity.getLot4();
 * java.math.BigDecimal expectqty1 = entity.getExpectqty1();
 * java.math.BigDecimal expectqty2 = entity.getExpectqty2();
 * String centerAbbr = entity.getCenterAbbr();
 * String customerAbbr = entity.getCustomerAbbr();
 * String productAbbr = entity.getProductAbbr();
 * Long usernum3 = entity.getUsernum3();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * String otherrefno1Nm = entity.getOtherrefno1Nm();
 * String ordertypeNm = entity.getOrdertypeNm();
 * Integer otherlot2Cnt = entity.getOtherlot2Cnt();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * entity.setShipschdate(shipschdate);
 * entity.setTrsolistkey(trsolistkey);
 * entity.setCenterCd(centerCd);
 * entity.setOwnersono(ownersono);
 * entity.setPhoneno(phoneno);
 * entity.setShiptocd(shiptocd);
 * entity.setDelivname(delivname);
 * entity.setCustomerCd(customerCd);
 * entity.setRmano(rmano);
 * entity.setOtherrefno1(otherrefno1);
 * entity.setOrdertype(ordertype);
 * entity.setFax1(fax1);
 * entity.setPrice2(price2);
 * entity.setNotes(notes);
 * entity.setProductCd(productCd);
 * entity.setLot3(lot3);
 * entity.setLot1(lot1);
 * entity.setLot4(lot4);
 * entity.setExpectqty1(expectqty1);
 * entity.setExpectqty2(expectqty2);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setCustomerAbbr(customerAbbr);
 * entity.setProductAbbr(productAbbr);
 * entity.setUsernum3(usernum3);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * entity.setOtherrefno1Nm(otherrefno1Nm);
 * entity.setOrdertypeNm(ordertypeNm);
 * entity.setOtherlot2Cnt(otherlot2Cnt);
 * entity.setTransportpriority(transportpriority);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingLoadingListPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** TRSOLISTKEY: {bigint(19)} */
    protected Long _trsolistkey;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** PHONENO: {varchar(60)} */
    protected String _phoneno;

    /** SHIPTOCD: {varchar(30)} */
    protected String _shiptocd;

    /** DELIVNAME: {varchar(255)} */
    protected String _delivname;

    /** CUSTOMER_CD: {varchar(60)} */
    protected String _customerCd;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** OTHERREFNO1: {varchar(60)} */
    protected String _otherrefno1;

    /** ORDERTYPE: {varchar(30)} */
    protected String _ordertype;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** PRICE2: {decimal(16, 6)} */
    protected java.math.BigDecimal _price2;

    /** NOTES: {varchar(30)} */
    protected String _notes;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** LOT3: {varchar(255)} */
    protected String _lot3;

    /** LOT1: {varchar(255)} */
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** EXPECTQTY1: {decimal(18)} */
    protected java.math.BigDecimal _expectqty1;

    /** EXPECTQTY2: {decimal(18)} */
    protected java.math.BigDecimal _expectqty2;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** CUSTOMER_ABBR: {varchar(60)} */
    protected String _customerAbbr;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    /** OTHERREFNO1_NM: {varchar(100)} */
    protected String _otherrefno1Nm;

    /** ORDERTYPE_NM: {varchar(100)} */
    protected String _ordertypeNm;

    /** OTHERLOT2_CNT: {int(10)} */
    protected Integer _otherlot2Cnt;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _transportpriority;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingLoadingListPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingLoadingListPrint";
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
        if (obj instanceof BsSqlShippingLoadingListPrint) {
            BsSqlShippingLoadingListPrint other = (BsSqlShippingLoadingListPrint)obj;
            if (!xSV(_shipschdate, other._shipschdate)) { return false; }
            if (!xSV(_trsolistkey, other._trsolistkey)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_ownersono, other._ownersono)) { return false; }
            if (!xSV(_phoneno, other._phoneno)) { return false; }
            if (!xSV(_shiptocd, other._shiptocd)) { return false; }
            if (!xSV(_delivname, other._delivname)) { return false; }
            if (!xSV(_customerCd, other._customerCd)) { return false; }
            if (!xSV(_rmano, other._rmano)) { return false; }
            if (!xSV(_otherrefno1, other._otherrefno1)) { return false; }
            if (!xSV(_ordertype, other._ordertype)) { return false; }
            if (!xSV(_fax1, other._fax1)) { return false; }
            if (!xSV(_price2, other._price2)) { return false; }
            if (!xSV(_notes, other._notes)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_expectqty1, other._expectqty1)) { return false; }
            if (!xSV(_expectqty2, other._expectqty2)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_customerAbbr, other._customerAbbr)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_otherrefno1Nm, other._otherrefno1Nm)) { return false; }
            if (!xSV(_ordertypeNm, other._ordertypeNm)) { return false; }
            if (!xSV(_otherlot2Cnt, other._otherlot2Cnt)) { return false; }
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
        hs = xCH(hs, _shipschdate);
        hs = xCH(hs, _trsolistkey);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _ownersono);
        hs = xCH(hs, _phoneno);
        hs = xCH(hs, _shiptocd);
        hs = xCH(hs, _delivname);
        hs = xCH(hs, _customerCd);
        hs = xCH(hs, _rmano);
        hs = xCH(hs, _otherrefno1);
        hs = xCH(hs, _ordertype);
        hs = xCH(hs, _fax1);
        hs = xCH(hs, _price2);
        hs = xCH(hs, _notes);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _expectqty1);
        hs = xCH(hs, _expectqty2);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _customerAbbr);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _userCd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _otherrefno1Nm);
        hs = xCH(hs, _ordertypeNm);
        hs = xCH(hs, _otherlot2Cnt);
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
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_trsolistkey));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_phoneno));
        sb.append(dm).append(xfND(_shiptocd));
        sb.append(dm).append(xfND(_delivname));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_otherrefno1));
        sb.append(dm).append(xfND(_ordertype));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_price2));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_expectqty1));
        sb.append(dm).append(xfND(_expectqty2));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_customerAbbr));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_otherrefno1Nm));
        sb.append(dm).append(xfND(_ordertypeNm));
        sb.append(dm).append(xfND(_otherlot2Cnt));
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
    public SqlShippingLoadingListPrint clone() {
        return (SqlShippingLoadingListPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] PHONENO: {varchar(60)} <br>
     * @return The value of the column 'PHONENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getPhoneno() {
        checkSpecifiedProperty("phoneno");
        return convertEmptyToNull(_phoneno);
    }

    /**
     * [set] PHONENO: {varchar(60)} <br>
     * @param phoneno The value of the column 'PHONENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPhoneno(String phoneno) {
        registerModifiedProperty("phoneno");
        _phoneno = phoneno;
    }

    /**
     * [get] SHIPTOCD: {varchar(30)} <br>
     * @return The value of the column 'SHIPTOCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShiptocd() {
        checkSpecifiedProperty("shiptocd");
        return convertEmptyToNull(_shiptocd);
    }

    /**
     * [set] SHIPTOCD: {varchar(30)} <br>
     * @param shiptocd The value of the column 'SHIPTOCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShiptocd(String shiptocd) {
        registerModifiedProperty("shiptocd");
        _shiptocd = shiptocd;
    }

    /**
     * [get] DELIVNAME: {varchar(255)} <br>
     * @return The value of the column 'DELIVNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getDelivname() {
        checkSpecifiedProperty("delivname");
        return convertEmptyToNull(_delivname);
    }

    /**
     * [set] DELIVNAME: {varchar(255)} <br>
     * @param delivname The value of the column 'DELIVNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDelivname(String delivname) {
        registerModifiedProperty("delivname");
        _delivname = delivname;
    }

    /**
     * [get] CUSTOMER_CD: {varchar(60)} <br>
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {varchar(60)} <br>
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
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
     * [get] OTHERREFNO1: {varchar(60)} <br>
     * @return The value of the column 'OTHERREFNO1'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1() {
        checkSpecifiedProperty("otherrefno1");
        return convertEmptyToNull(_otherrefno1);
    }

    /**
     * [set] OTHERREFNO1: {varchar(60)} <br>
     * @param otherrefno1 The value of the column 'OTHERREFNO1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1(String otherrefno1) {
        registerModifiedProperty("otherrefno1");
        _otherrefno1 = otherrefno1;
    }

    /**
     * [get] ORDERTYPE: {varchar(30)} <br>
     * @return The value of the column 'ORDERTYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertype() {
        checkSpecifiedProperty("ordertype");
        return convertEmptyToNull(_ordertype);
    }

    /**
     * [set] ORDERTYPE: {varchar(30)} <br>
     * @param ordertype The value of the column 'ORDERTYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertype(String ordertype) {
        registerModifiedProperty("ordertype");
        _ordertype = ordertype;
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
     * [get] NOTES: {varchar(30)} <br>
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(30)} <br>
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
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
     * [get] LOT3: {varchar(255)} <br>
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(255)} <br>
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] LOT1: {varchar(255)} <br>
     * @return The value of the column 'LOT1'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot1() {
        checkSpecifiedProperty("lot1");
        return convertEmptyToNull(_lot1);
    }

    /**
     * [set] LOT1: {varchar(255)} <br>
     * @param lot1 The value of the column 'LOT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot1(String lot1) {
        registerModifiedProperty("lot1");
        _lot1 = lot1;
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
     * [get] EXPECTQTY1: {decimal(18)} <br>
     * @return The value of the column 'EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectqty1() {
        checkSpecifiedProperty("expectqty1");
        return _expectqty1;
    }

    /**
     * [set] EXPECTQTY1: {decimal(18)} <br>
     * @param expectqty1 The value of the column 'EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty1(java.math.BigDecimal expectqty1) {
        registerModifiedProperty("expectqty1");
        _expectqty1 = expectqty1;
    }

    /**
     * [get] EXPECTQTY2: {decimal(18)} <br>
     * @return The value of the column 'EXPECTQTY2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExpectqty2() {
        checkSpecifiedProperty("expectqty2");
        return _expectqty2;
    }

    /**
     * [set] EXPECTQTY2: {decimal(18)} <br>
     * @param expectqty2 The value of the column 'EXPECTQTY2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExpectqty2(java.math.BigDecimal expectqty2) {
        registerModifiedProperty("expectqty2");
        _expectqty2 = expectqty2;
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
     * [get] OTHERREFNO1_NM: {varchar(100)} <br>
     * @return The value of the column 'OTHERREFNO1_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOtherrefno1Nm() {
        checkSpecifiedProperty("otherrefno1Nm");
        return convertEmptyToNull(_otherrefno1Nm);
    }

    /**
     * [set] OTHERREFNO1_NM: {varchar(100)} <br>
     * @param otherrefno1Nm The value of the column 'OTHERREFNO1_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherrefno1Nm(String otherrefno1Nm) {
        registerModifiedProperty("otherrefno1Nm");
        _otherrefno1Nm = otherrefno1Nm;
    }

    /**
     * [get] ORDERTYPE_NM: {varchar(100)} <br>
     * @return The value of the column 'ORDERTYPE_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getOrdertypeNm() {
        checkSpecifiedProperty("ordertypeNm");
        return convertEmptyToNull(_ordertypeNm);
    }

    /**
     * [set] ORDERTYPE_NM: {varchar(100)} <br>
     * @param ordertypeNm The value of the column 'ORDERTYPE_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOrdertypeNm(String ordertypeNm) {
        registerModifiedProperty("ordertypeNm");
        _ordertypeNm = ordertypeNm;
    }

    /**
     * [get] OTHERLOT2_CNT: {int(10)} <br>
     * @return The value of the column 'OTHERLOT2_CNT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getOtherlot2Cnt() {
        checkSpecifiedProperty("otherlot2Cnt");
        return _otherlot2Cnt;
    }

    /**
     * [set] OTHERLOT2_CNT: {int(10)} <br>
     * @param otherlot2Cnt The value of the column 'OTHERLOT2_CNT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setOtherlot2Cnt(Integer otherlot2Cnt) {
        registerModifiedProperty("otherlot2Cnt");
        _otherlot2Cnt = otherlot2Cnt;
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
