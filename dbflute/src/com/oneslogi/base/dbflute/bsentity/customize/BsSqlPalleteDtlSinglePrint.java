package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlPalleteDtlSinglePrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSOLISTKEY, WORKALLOCATEID, FAX1, CARRIERSNAME, SHIPSCHDATE, OWNERSONO, NOTES, RMANO, SOPALLETNO, STOCK_TYPE_CD, SOLINENO, CASE_EXPECTQTY1, LOT1, LOT4, IFITEMCD, LOCATION_CD, LOT3, LOT2, CUSTOMER_ABBR, CENTER_ABBR, PRODUCT_CD, PRODUCT_ABBR, USERNUM3, TRANSPORTPRIORITY, OTHERCD3, OTHERREFNO1
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
 * Long workallocateid = entity.getWorkallocateid();
 * String fax1 = entity.getFax1();
 * String carriersname = entity.getCarriersname();
 * String shipschdate = entity.getShipschdate();
 * String ownersono = entity.getOwnersono();
 * String notes = entity.getNotes();
 * String rmano = entity.getRmano();
 * String sopalletno = entity.getSopalletno();
 * String stockTypeCd = entity.getStockTypeCd();
 * Long solineno = entity.getSolineno();
 * java.math.BigDecimal caseExpectqty1 = entity.getCaseExpectqty1();
 * String lot1 = entity.getLot1();
 * String lot4 = entity.getLot4();
 * String ifitemcd = entity.getIfitemcd();
 * String locationCd = entity.getLocationCd();
 * String lot3 = entity.getLot3();
 * String lot2 = entity.getLot2();
 * String customerAbbr = entity.getCustomerAbbr();
 * String centerAbbr = entity.getCenterAbbr();
 * String productCd = entity.getProductCd();
 * String productAbbr = entity.getProductAbbr();
 * Long usernum3 = entity.getUsernum3();
 * java.math.BigDecimal transportpriority = entity.getTransportpriority();
 * String othercd3 = entity.getOthercd3();
 * String otherrefno1 = entity.getOtherrefno1();
 * entity.setTrsolistkey(trsolistkey);
 * entity.setWorkallocateid(workallocateid);
 * entity.setFax1(fax1);
 * entity.setCarriersname(carriersname);
 * entity.setShipschdate(shipschdate);
 * entity.setOwnersono(ownersono);
 * entity.setNotes(notes);
 * entity.setRmano(rmano);
 * entity.setSopalletno(sopalletno);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setSolineno(solineno);
 * entity.setCaseExpectqty1(caseExpectqty1);
 * entity.setLot1(lot1);
 * entity.setLot4(lot4);
 * entity.setIfitemcd(ifitemcd);
 * entity.setLocationCd(locationCd);
 * entity.setLot3(lot3);
 * entity.setLot2(lot2);
 * entity.setCustomerAbbr(customerAbbr);
 * entity.setCenterAbbr(centerAbbr);
 * entity.setProductCd(productCd);
 * entity.setProductAbbr(productAbbr);
 * entity.setUsernum3(usernum3);
 * entity.setTransportpriority(transportpriority);
 * entity.setOthercd3(othercd3);
 * entity.setOtherrefno1(otherrefno1);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlPalleteDtlSinglePrint extends AbstractEntity implements CustomizeEntity {

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

    /** WORKALLOCATEID: {bigint(19)} */
    protected Long _workallocateid;

    /** FAX1: {varchar(60)} */
    protected String _fax1;

    /** CARRIERSNAME: {varchar(100)} */
    protected String _carriersname;

    /** SHIPSCHDATE: {varchar(8)} */
    protected String _shipschdate;

    /** OWNERSONO: {varchar(60)} */
    protected String _ownersono;

    /** NOTES: {varchar(4000)} */
    protected String _notes;

    /** RMANO: {varchar(60)} */
    protected String _rmano;

    /** SOPALLETNO: {varchar(30)} */
    protected String _sopalletno;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** SOLINENO: {bigint(19)} */
    protected Long _solineno;

    /** CASE_EXPECTQTY1: {decimal(18)} */
    protected java.math.BigDecimal _caseExpectqty1;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** IFITEMCD: {varchar(30)} */
    protected String _ifitemcd;

    /** LOCATION_CD: {varchar(30)} */
    protected String _locationCd;

    /** LOT3: {varchar(255)} */
    protected String _lot3;

    /** LOT2: {varchar(255)} */
    protected String _lot2;

    /** CUSTOMER_ABBR: {varchar(60)} */
    protected String _customerAbbr;

    /** CENTER_ABBR: {varchar(60)} */
    protected String _centerAbbr;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_ABBR: {varchar(60)} */
    protected String _productAbbr;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** TRANSPORTPRIORITY: {decimal(16, 6)} */
    protected java.math.BigDecimal _transportpriority;

    /** OTHERCD3: {varchar(30)} */
    protected String _othercd3;

    /** OTHERREFNO1: {varchar(100)} */
    protected String _otherrefno1;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlPalleteDtlSinglePrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlPalleteDtlSinglePrint";
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
        if (obj instanceof BsSqlPalleteDtlSinglePrint) {
            BsSqlPalleteDtlSinglePrint other = (BsSqlPalleteDtlSinglePrint)obj;
            if (!xSV(_trsolistkey, other._trsolistkey)) { return false; }
            if (!xSV(_workallocateid, other._workallocateid)) { return false; }
            if (!xSV(_fax1, other._fax1)) { return false; }
            if (!xSV(_carriersname, other._carriersname)) { return false; }
            if (!xSV(_shipschdate, other._shipschdate)) { return false; }
            if (!xSV(_ownersono, other._ownersono)) { return false; }
            if (!xSV(_notes, other._notes)) { return false; }
            if (!xSV(_rmano, other._rmano)) { return false; }
            if (!xSV(_sopalletno, other._sopalletno)) { return false; }
            if (!xSV(_stockTypeCd, other._stockTypeCd)) { return false; }
            if (!xSV(_solineno, other._solineno)) { return false; }
            if (!xSV(_caseExpectqty1, other._caseExpectqty1)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_ifitemcd, other._ifitemcd)) { return false; }
            if (!xSV(_locationCd, other._locationCd)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_lot2, other._lot2)) { return false; }
            if (!xSV(_customerAbbr, other._customerAbbr)) { return false; }
            if (!xSV(_centerAbbr, other._centerAbbr)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productAbbr, other._productAbbr)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_transportpriority, other._transportpriority)) { return false; }
            if (!xSV(_othercd3, other._othercd3)) { return false; }
            if (!xSV(_otherrefno1, other._otherrefno1)) { return false; }
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
        hs = xCH(hs, _workallocateid);
        hs = xCH(hs, _fax1);
        hs = xCH(hs, _carriersname);
        hs = xCH(hs, _shipschdate);
        hs = xCH(hs, _ownersono);
        hs = xCH(hs, _notes);
        hs = xCH(hs, _rmano);
        hs = xCH(hs, _sopalletno);
        hs = xCH(hs, _stockTypeCd);
        hs = xCH(hs, _solineno);
        hs = xCH(hs, _caseExpectqty1);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _ifitemcd);
        hs = xCH(hs, _locationCd);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _lot2);
        hs = xCH(hs, _customerAbbr);
        hs = xCH(hs, _centerAbbr);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productAbbr);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _transportpriority);
        hs = xCH(hs, _othercd3);
        hs = xCH(hs, _otherrefno1);
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
        sb.append(dm).append(xfND(_workallocateid));
        sb.append(dm).append(xfND(_fax1));
        sb.append(dm).append(xfND(_carriersname));
        sb.append(dm).append(xfND(_shipschdate));
        sb.append(dm).append(xfND(_ownersono));
        sb.append(dm).append(xfND(_notes));
        sb.append(dm).append(xfND(_rmano));
        sb.append(dm).append(xfND(_sopalletno));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_solineno));
        sb.append(dm).append(xfND(_caseExpectqty1));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_locationCd));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_customerAbbr));
        sb.append(dm).append(xfND(_centerAbbr));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productAbbr));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_transportpriority));
        sb.append(dm).append(xfND(_othercd3));
        sb.append(dm).append(xfND(_otherrefno1));
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
    public SqlPalleteDtlSinglePrint clone() {
        return (SqlPalleteDtlSinglePrint)super.clone();
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
     * [get] NOTES: {varchar(4000)} <br>
     * @return The value of the column 'NOTES'. (NullAllowed even if selected: for no constraint)
     */
    public String getNotes() {
        checkSpecifiedProperty("notes");
        return convertEmptyToNull(_notes);
    }

    /**
     * [set] NOTES: {varchar(4000)} <br>
     * @param notes The value of the column 'NOTES'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNotes(String notes) {
        registerModifiedProperty("notes");
        _notes = notes;
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
     * [get] STOCK_TYPE_CD: {varchar(30)} <br>
     * @return The value of the column 'STOCK_TYPE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getStockTypeCd() {
        checkSpecifiedProperty("stockTypeCd");
        return convertEmptyToNull(_stockTypeCd);
    }

    /**
     * [set] STOCK_TYPE_CD: {varchar(30)} <br>
     * @param stockTypeCd The value of the column 'STOCK_TYPE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockTypeCd(String stockTypeCd) {
        registerModifiedProperty("stockTypeCd");
        _stockTypeCd = stockTypeCd;
    }

    /**
     * [get] SOLINENO: {bigint(19)} <br>
     * @return The value of the column 'SOLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSolineno() {
        checkSpecifiedProperty("solineno");
        return _solineno;
    }

    /**
     * [set] SOLINENO: {bigint(19)} <br>
     * @param solineno The value of the column 'SOLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSolineno(Long solineno) {
        registerModifiedProperty("solineno");
        _solineno = solineno;
    }

    /**
     * [get] CASE_EXPECTQTY1: {decimal(18)} <br>
     * @return The value of the column 'CASE_EXPECTQTY1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getCaseExpectqty1() {
        checkSpecifiedProperty("caseExpectqty1");
        return _caseExpectqty1;
    }

    /**
     * [set] CASE_EXPECTQTY1: {decimal(18)} <br>
     * @param caseExpectqty1 The value of the column 'CASE_EXPECTQTY1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseExpectqty1(java.math.BigDecimal caseExpectqty1) {
        registerModifiedProperty("caseExpectqty1");
        _caseExpectqty1 = caseExpectqty1;
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
     * [get] LOT2: {varchar(255)} <br>
     * @return The value of the column 'LOT2'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot2() {
        checkSpecifiedProperty("lot2");
        return convertEmptyToNull(_lot2);
    }

    /**
     * [set] LOT2: {varchar(255)} <br>
     * @param lot2 The value of the column 'LOT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot2(String lot2) {
        registerModifiedProperty("lot2");
        _lot2 = lot2;
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
}
