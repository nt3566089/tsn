package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlShippingPalleteDetailInfoList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     SYMBOLLINENO, RCVKEY, SYMBOLMAKENO, PRODUCT_CD, PRODUCT_NM, LOT1, LOT4, LOT3, LOT2, STOCK_TYPE_CD, MAKERCASENO, RECEIVEDATE, TOTALQTY, FOREIGNCARGOFLG, IFITEMCD, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
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
 * Long symbollineno = entity.getSymbollineno();
 * Long rcvkey = entity.getRcvkey();
 * String symbolmakeno = entity.getSymbolmakeno();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String lot1 = entity.getLot1();
 * String lot4 = entity.getLot4();
 * String lot3 = entity.getLot3();
 * String lot2 = entity.getLot2();
 * String stockTypeCd = entity.getStockTypeCd();
 * String makercaseno = entity.getMakercaseno();
 * String receivedate = entity.getReceivedate();
 * java.math.BigDecimal totalqty = entity.getTotalqty();
 * String foreigncargoflg = entity.getForeigncargoflg();
 * String ifitemcd = entity.getIfitemcd();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * entity.setSymbollineno(symbollineno);
 * entity.setRcvkey(rcvkey);
 * entity.setSymbolmakeno(symbolmakeno);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setLot1(lot1);
 * entity.setLot4(lot4);
 * entity.setLot3(lot3);
 * entity.setLot2(lot2);
 * entity.setStockTypeCd(stockTypeCd);
 * entity.setMakercaseno(makercaseno);
 * entity.setReceivedate(receivedate);
 * entity.setTotalqty(totalqty);
 * entity.setForeigncargoflg(foreigncargoflg);
 * entity.setIfitemcd(ifitemcd);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlShippingPalleteDetailInfoList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SYMBOLLINENO: {bigint(19)} */
    protected Long _symbollineno;

    /** RCVKEY: {bigint(19)} */
    protected Long _rcvkey;

    /** SYMBOLMAKENO: {varchar(30)} */
    protected String _symbolmakeno;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** LOT1: {varchar(60)} */
    protected String _lot1;

    /** LOT4: {varchar(8)} */
    protected String _lot4;

    /** LOT3: {varchar(60)} */
    protected String _lot3;

    /** LOT2: {varchar(60)} */
    protected String _lot2;

    /** STOCK_TYPE_CD: {varchar(30)} */
    protected String _stockTypeCd;

    /** MAKERCASENO: {varchar(60)} */
    protected String _makercaseno;

    /** RECEIVEDATE: {varchar(8)} */
    protected String _receivedate;

    /** TOTALQTY: {decimal(38)} */
    protected java.math.BigDecimal _totalqty;

    /** FOREIGNCARGOFLG: {char(1)} */
    protected String _foreigncargoflg;

    /** IFITEMCD: {varchar(30)} */
    protected String _ifitemcd;

    /** CENTER_CD: {varchar(30)} */
    protected String _centerCd;

    /** CENTER_NM: {varchar(60)} */
    protected String _centerNm;

    /** CLIENT_CD: {varchar(30)} */
    protected String _clientCd;

    /** CLIENT_NM: {varchar(60)} */
    protected String _clientNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlShippingPalleteDetailInfoListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlShippingPalleteDetailInfoList";
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
        if (obj instanceof BsSqlShippingPalleteDetailInfoList) {
            BsSqlShippingPalleteDetailInfoList other = (BsSqlShippingPalleteDetailInfoList)obj;
            if (!xSV(_symbollineno, other._symbollineno)) { return false; }
            if (!xSV(_rcvkey, other._rcvkey)) { return false; }
            if (!xSV(_symbolmakeno, other._symbolmakeno)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_lot1, other._lot1)) { return false; }
            if (!xSV(_lot4, other._lot4)) { return false; }
            if (!xSV(_lot3, other._lot3)) { return false; }
            if (!xSV(_lot2, other._lot2)) { return false; }
            if (!xSV(_stockTypeCd, other._stockTypeCd)) { return false; }
            if (!xSV(_makercaseno, other._makercaseno)) { return false; }
            if (!xSV(_receivedate, other._receivedate)) { return false; }
            if (!xSV(_totalqty, other._totalqty)) { return false; }
            if (!xSV(_foreigncargoflg, other._foreigncargoflg)) { return false; }
            if (!xSV(_ifitemcd, other._ifitemcd)) { return false; }
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_clientCd, other._clientCd)) { return false; }
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
        hs = xCH(hs, _symbollineno);
        hs = xCH(hs, _rcvkey);
        hs = xCH(hs, _symbolmakeno);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _lot1);
        hs = xCH(hs, _lot4);
        hs = xCH(hs, _lot3);
        hs = xCH(hs, _lot2);
        hs = xCH(hs, _stockTypeCd);
        hs = xCH(hs, _makercaseno);
        hs = xCH(hs, _receivedate);
        hs = xCH(hs, _totalqty);
        hs = xCH(hs, _foreigncargoflg);
        hs = xCH(hs, _ifitemcd);
        hs = xCH(hs, _centerCd);
        hs = xCH(hs, _centerNm);
        hs = xCH(hs, _clientCd);
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
        sb.append(dm).append(xfND(_symbollineno));
        sb.append(dm).append(xfND(_rcvkey));
        sb.append(dm).append(xfND(_symbolmakeno));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_lot1));
        sb.append(dm).append(xfND(_lot4));
        sb.append(dm).append(xfND(_lot3));
        sb.append(dm).append(xfND(_lot2));
        sb.append(dm).append(xfND(_stockTypeCd));
        sb.append(dm).append(xfND(_makercaseno));
        sb.append(dm).append(xfND(_receivedate));
        sb.append(dm).append(xfND(_totalqty));
        sb.append(dm).append(xfND(_foreigncargoflg));
        sb.append(dm).append(xfND(_ifitemcd));
        sb.append(dm).append(xfND(_centerCd));
        sb.append(dm).append(xfND(_centerNm));
        sb.append(dm).append(xfND(_clientCd));
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
    public SqlShippingPalleteDetailInfoList clone() {
        return (SqlShippingPalleteDetailInfoList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SYMBOLLINENO: {bigint(19)} <br>
     * @return The value of the column 'SYMBOLLINENO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSymbollineno() {
        checkSpecifiedProperty("symbollineno");
        return _symbollineno;
    }

    /**
     * [set] SYMBOLLINENO: {bigint(19)} <br>
     * @param symbollineno The value of the column 'SYMBOLLINENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbollineno(Long symbollineno) {
        registerModifiedProperty("symbollineno");
        _symbollineno = symbollineno;
    }

    /**
     * [get] RCVKEY: {bigint(19)} <br>
     * @return The value of the column 'RCVKEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRcvkey() {
        checkSpecifiedProperty("rcvkey");
        return _rcvkey;
    }

    /**
     * [set] RCVKEY: {bigint(19)} <br>
     * @param rcvkey The value of the column 'RCVKEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRcvkey(Long rcvkey) {
        registerModifiedProperty("rcvkey");
        _rcvkey = rcvkey;
    }

    /**
     * [get] SYMBOLMAKENO: {varchar(30)} <br>
     * @return The value of the column 'SYMBOLMAKENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSymbolmakeno() {
        checkSpecifiedProperty("symbolmakeno");
        return convertEmptyToNull(_symbolmakeno);
    }

    /**
     * [set] SYMBOLMAKENO: {varchar(30)} <br>
     * @param symbolmakeno The value of the column 'SYMBOLMAKENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSymbolmakeno(String symbolmakeno) {
        registerModifiedProperty("symbolmakeno");
        _symbolmakeno = symbolmakeno;
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
     * [get] PRODUCT_NM: {varchar(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getProductNm() {
        checkSpecifiedProperty("productNm");
        return convertEmptyToNull(_productNm);
    }

    /**
     * [set] PRODUCT_NM: {varchar(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductNm(String productNm) {
        registerModifiedProperty("productNm");
        _productNm = productNm;
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
     * [get] MAKERCASENO: {varchar(60)} <br>
     * @return The value of the column 'MAKERCASENO'. (NullAllowed even if selected: for no constraint)
     */
    public String getMakercaseno() {
        checkSpecifiedProperty("makercaseno");
        return convertEmptyToNull(_makercaseno);
    }

    /**
     * [set] MAKERCASENO: {varchar(60)} <br>
     * @param makercaseno The value of the column 'MAKERCASENO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMakercaseno(String makercaseno) {
        registerModifiedProperty("makercaseno");
        _makercaseno = makercaseno;
    }

    /**
     * [get] RECEIVEDATE: {varchar(8)} <br>
     * @return The value of the column 'RECEIVEDATE'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceivedate() {
        checkSpecifiedProperty("receivedate");
        return convertEmptyToNull(_receivedate);
    }

    /**
     * [set] RECEIVEDATE: {varchar(8)} <br>
     * @param receivedate The value of the column 'RECEIVEDATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivedate(String receivedate) {
        registerModifiedProperty("receivedate");
        _receivedate = receivedate;
    }

    /**
     * [get] TOTALQTY: {decimal(38)} <br>
     * @return The value of the column 'TOTALQTY'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTotalqty() {
        checkSpecifiedProperty("totalqty");
        return _totalqty;
    }

    /**
     * [set] TOTALQTY: {decimal(38)} <br>
     * @param totalqty The value of the column 'TOTALQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTotalqty(java.math.BigDecimal totalqty) {
        registerModifiedProperty("totalqty");
        _totalqty = totalqty;
    }

    /**
     * [get] FOREIGNCARGOFLG: {char(1)} <br>
     * @return The value of the column 'FOREIGNCARGOFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getForeigncargoflg() {
        checkSpecifiedProperty("foreigncargoflg");
        return convertEmptyToNull(_foreigncargoflg);
    }

    /**
     * [set] FOREIGNCARGOFLG: {char(1)} <br>
     * @param foreigncargoflg The value of the column 'FOREIGNCARGOFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setForeigncargoflg(String foreigncargoflg) {
        registerModifiedProperty("foreigncargoflg");
        _foreigncargoflg = foreigncargoflg;
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
     * [get] CLIENT_CD: {varchar(30)} <br>
     * @return The value of the column 'CLIENT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getClientCd() {
        checkSpecifiedProperty("clientCd");
        return convertEmptyToNull(_clientCd);
    }

    /**
     * [set] CLIENT_CD: {varchar(30)} <br>
     * @param clientCd The value of the column 'CLIENT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setClientCd(String clientCd) {
        registerModifiedProperty("clientCd");
        _clientCd = clientCd;
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
