package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlTTrsymbolInventoryInputProductSortingPlace. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     TRSYMBOL_ID, CASECD, LOT4, PRODUCT_CD, RECEIVEDQTY, LOT3, SOTEDUNIT, ASSORTEDUNIT
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
 * Long trsymbolId = entity.getTrsymbolId();
 * Long casecd = entity.getCasecd();
 * String lot4 = entity.getLot4();
 * String productCd = entity.getProductCd();
 * java.math.BigDecimal receivedqty = entity.getReceivedqty();
 * String lot3 = entity.getLot3();
 * String sotedunit = entity.getSotedunit();
 * String assortedunit = entity.getAssortedunit();
 * entity.setTrsymbolId(trsymbolId);
 * entity.setCasecd(casecd);
 * entity.setLot4(lot4);
 * entity.setProductCd(productCd);
 * entity.setReceivedqty(receivedqty);
 * entity.setLot3(lot3);
 * entity.setSotedunit(sotedunit);
 * entity.setAssortedunit(assortedunit);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlTTrsymbolInventoryInputProductSortingPlace extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TRSYMBOL_ID: {bigint(19)} */
    protected Long _trsymbolId;

    /** CASECD: {bigint(19)} */
    protected Long _casecd;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** RECEIVEDQTY: {decimal(16, 6)} */
    protected java.math.BigDecimal _receivedqty;

    /** LOT3: {varchar(30)} */
    protected String _lot3;

    /** SOTEDUNIT: {varchar(30)} */
    protected String _sotedunit;

    /** ASSORTEDUNIT: {varchar(255)} */
    protected String _assortedunit;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlTTrsymbolInventoryInputProductSortingPlaceDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlTTrsymbolInventoryInputProductSortingPlace";
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
        if (obj instanceof BsSqlTTrsymbolInventoryInputProductSortingPlace) {
            BsSqlTTrsymbolInventoryInputProductSortingPlace other = (BsSqlTTrsymbolInventoryInputProductSortingPlace)obj;
            if (!xSV(_trsymbolId, other._trsymbolId)) { return false; }
            if (!xSV(_casecd, other._casecd)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_receivedqty, other._receivedqty)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_sotedunit, other._sotedunit)) { return false; }
            if (!xSV(_assortedunit, other._assortedunit)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _trsymbolId);
        hs = xCH(hs, _casecd);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _receivedqty);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _sotedunit);
        hs = xCH(hs, _assortedunit);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_trsymbolId));
        sb.append(dm).append(xfND(_casecd));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_receivedqty));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_sotedunit));
        sb.append(dm).append(xfND(_assortedunit));
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
    public SqlTTrsymbolInventoryInputProductSortingPlace clone() {
        return (SqlTTrsymbolInventoryInputProductSortingPlace)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TRSYMBOL_ID: {bigint(19)} <br>
     * @return The value of the column 'TRSYMBOL_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getTrsymbolId() {
        checkSpecifiedProperty("trsymbolId");
        return _trsymbolId;
    }

    /**
     * [set] TRSYMBOL_ID: {bigint(19)} <br>
     * @param trsymbolId The value of the column 'TRSYMBOL_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTrsymbolId(Long trsymbolId) {
        registerModifiedProperty("trsymbolId");
        _trsymbolId = trsymbolId;
    }

    /**
     * [get] CASECD: {bigint(19)} <br>
     * @return The value of the column 'CASECD'. (NullAllowed even if selected: for no constraint)
     */
    public Long getCasecd() {
        checkSpecifiedProperty("casecd");
        return _casecd;
    }

    /**
     * [set] CASECD: {bigint(19)} <br>
     * @param casecd The value of the column 'CASECD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCasecd(Long casecd) {
        registerModifiedProperty("casecd");
        _casecd = casecd;
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
     * [get] RECEIVEDQTY: {decimal(16, 6)} <br>
     * @return The value of the column 'RECEIVEDQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getReceivedqty() {
        checkSpecifiedProperty("receivedqty");
        return _receivedqty;
    }

    /**
     * [set] RECEIVEDQTY: {decimal(16, 6)} <br>
     * @param receivedqty The value of the column 'RECEIVEDQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedqty(java.math.BigDecimal receivedqty) {
        registerModifiedProperty("receivedqty");
        _receivedqty = receivedqty;
    }

    /**
     * [get] LOT3: {varchar(30)} <br>
     * @return The value of the column 'LOT3'. (NullAllowed even if selected: for no constraint)
     */
    public String getLot3() {
        checkSpecifiedProperty("lot3");
        return convertEmptyToNull(_lot3);
    }

    /**
     * [set] LOT3: {varchar(30)} <br>
     * @param lot3 The value of the column 'LOT3'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLot3(String lot3) {
        registerModifiedProperty("lot3");
        _lot3 = lot3;
    }

    /**
     * [get] SOTEDUNIT: {varchar(30)} <br>
     * @return The value of the column 'SOTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getSotedunit() {
        checkSpecifiedProperty("sotedunit");
        return convertEmptyToNull(_sotedunit);
    }

    /**
     * [set] SOTEDUNIT: {varchar(30)} <br>
     * @param sotedunit The value of the column 'SOTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSotedunit(String sotedunit) {
        registerModifiedProperty("sotedunit");
        _sotedunit = sotedunit;
    }

    /**
     * [get] ASSORTEDUNIT: {varchar(255)} <br>
     * @return The value of the column 'ASSORTEDUNIT'. (NullAllowed even if selected: for no constraint)
     */
    public String getAssortedunit() {
        checkSpecifiedProperty("assortedunit");
        return convertEmptyToNull(_assortedunit);
    }

    /**
     * [set] ASSORTEDUNIT: {varchar(255)} <br>
     * @param assortedunit The value of the column 'ASSORTEDUNIT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAssortedunit(String assortedunit) {
        registerModifiedProperty("assortedunit");
        _assortedunit = assortedunit;
    }
}
