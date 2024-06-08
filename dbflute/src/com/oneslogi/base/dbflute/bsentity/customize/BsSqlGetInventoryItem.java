package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlGetInventoryItem. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     CENTER_CD, CENTER_NM, STOCKDATE, PRODUCT_CD, ITEM_NAME, DUALITEMCDFLG, DUALITEMCD, YDAYTLEQULYTOTALINV, TDAY_DIFF, SYSINVTOTALINV, INVESTTOTALINV, INVESTKEEPLOCINV, INVESTRECEIVELOCINV, INVESTDAMAGEITEM, INVESTCLSSIFYLOCINV, INVESTTMPLOCINV, INVESTAUTOINV, EXCESSTOTALINV, DEFECTTOTALINV, CAPITEMFLG, USER_CD, USER_NM, CGGDID_NM, INVENTORYREPORTINV, USERNUM3, CGGDID
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
 * String itemName = entity.getItemName();
 * java.math.BigDecimal dualitemcdflg = entity.getDualitemcdflg();
 * String dualitemcd = entity.getDualitemcd();
 * java.math.BigDecimal ydaytlequlytotalinv = entity.getYdaytlequlytotalinv();
 * java.math.BigDecimal tdayDiff = entity.getTdayDiff();
 * java.math.BigDecimal sysinvtotalinv = entity.getSysinvtotalinv();
 * java.math.BigDecimal investtotalinv = entity.getInvesttotalinv();
 * java.math.BigDecimal investkeeplocinv = entity.getInvestkeeplocinv();
 * java.math.BigDecimal investreceivelocinv = entity.getInvestreceivelocinv();
 * java.math.BigDecimal investdamageitem = entity.getInvestdamageitem();
 * java.math.BigDecimal investclssifylocinv = entity.getInvestclssifylocinv();
 * java.math.BigDecimal investtmplocinv = entity.getInvesttmplocinv();
 * java.math.BigDecimal investautoinv = entity.getInvestautoinv();
 * java.math.BigDecimal excesstotalinv = entity.getExcesstotalinv();
 * java.math.BigDecimal defecttotalinv = entity.getDefecttotalinv();
 * String capitemflg = entity.getCapitemflg();
 * String userCd = entity.getUserCd();
 * String userNm = entity.getUserNm();
 * String cggdidNm = entity.getCggdidNm();
 * String inventoryreportinv = entity.getInventoryreportinv();
 * Long usernum3 = entity.getUsernum3();
 * String cggdid = entity.getCggdid();
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setStockdate(stockdate);
 * entity.setProductCd(productCd);
 * entity.setItemName(itemName);
 * entity.setDualitemcdflg(dualitemcdflg);
 * entity.setDualitemcd(dualitemcd);
 * entity.setYdaytlequlytotalinv(ydaytlequlytotalinv);
 * entity.setTdayDiff(tdayDiff);
 * entity.setSysinvtotalinv(sysinvtotalinv);
 * entity.setInvesttotalinv(investtotalinv);
 * entity.setInvestkeeplocinv(investkeeplocinv);
 * entity.setInvestreceivelocinv(investreceivelocinv);
 * entity.setInvestdamageitem(investdamageitem);
 * entity.setInvestclssifylocinv(investclssifylocinv);
 * entity.setInvesttmplocinv(investtmplocinv);
 * entity.setInvestautoinv(investautoinv);
 * entity.setExcesstotalinv(excesstotalinv);
 * entity.setDefecttotalinv(defecttotalinv);
 * entity.setCapitemflg(capitemflg);
 * entity.setUserCd(userCd);
 * entity.setUserNm(userNm);
 * entity.setCggdidNm(cggdidNm);
 * entity.setInventoryreportinv(inventoryreportinv);
 * entity.setUsernum3(usernum3);
 * entity.setCggdid(cggdid);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlGetInventoryItem extends AbstractEntity implements CustomizeEntity {

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

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** ITEM_NAME: {varchar(60)} */
    protected String _itemName;

    /** DUALITEMCDFLG: {decimal(16, 6)} */
    protected java.math.BigDecimal _dualitemcdflg;

    /** DUALITEMCD: {varchar(30)} */
    protected String _dualitemcd;

    /** YDAYTLEQULYTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _ydaytlequlytotalinv;

    /** TDAY_DIFF: {decimal(17, 6)} */
    protected java.math.BigDecimal _tdayDiff;

    /** SYSINVTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _sysinvtotalinv;

    /** INVESTTOTALINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investtotalinv;

    /** INVESTKEEPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investkeeplocinv;

    /** INVESTRECEIVELOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investreceivelocinv;

    /** INVESTDAMAGEITEM: {decimal(16, 6)} */
    protected java.math.BigDecimal _investdamageitem;

    /** INVESTCLSSIFYLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investclssifylocinv;

    /** INVESTTMPLOCINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investtmplocinv;

    /** INVESTAUTOINV: {decimal(16, 6)} */
    protected java.math.BigDecimal _investautoinv;

    /** EXCESSTOTALINV: {decimal(17, 6)} */
    protected java.math.BigDecimal _excesstotalinv;

    /** DEFECTTOTALINV: {decimal(17, 6)} */
    protected java.math.BigDecimal _defecttotalinv;

    /** CAPITEMFLG: {char(1)} */
    protected String _capitemflg;

    /** USER_CD: {varchar(30)} */
    protected String _userCd;

    /** USER_NM: {varchar(60)} */
    protected String _userNm;

    /** CGGDID_NM: {varchar(100)} */
    protected String _cggdidNm;

    /** INVENTORYREPORTINV: {varchar(19)} */
    protected String _inventoryreportinv;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlGetInventoryItemDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlGetInventoryItem";
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
        if (obj instanceof BsSqlGetInventoryItem) {
            BsSqlGetInventoryItem other = (BsSqlGetInventoryItem)obj;
            if (!xSV(_centerCd, other._centerCd)) { return false; }
            if (!xSV(_centerNm, other._centerNm)) { return false; }
            if (!xSV(_stockdate, other._stockdate)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_itemName, other._itemName)) { return false; }
            if (!xSV(_dualitemcdflg, other._dualitemcdflg)) { return false; }
            if (!xSV(_dualitemcd, other._dualitemcd)) { return false; }
            if (!xSV(_ydaytlequlytotalinv, other._ydaytlequlytotalinv)) { return false; }
            if (!xSV(_tdayDiff, other._tdayDiff)) { return false; }
            if (!xSV(_sysinvtotalinv, other._sysinvtotalinv)) { return false; }
            if (!xSV(_investtotalinv, other._investtotalinv)) { return false; }
            if (!xSV(_investkeeplocinv, other._investkeeplocinv)) { return false; }
            if (!xSV(_investreceivelocinv, other._investreceivelocinv)) { return false; }
            if (!xSV(_investdamageitem, other._investdamageitem)) { return false; }
            if (!xSV(_investclssifylocinv, other._investclssifylocinv)) { return false; }
            if (!xSV(_investtmplocinv, other._investtmplocinv)) { return false; }
            if (!xSV(_investautoinv, other._investautoinv)) { return false; }
            if (!xSV(_excesstotalinv, other._excesstotalinv)) { return false; }
            if (!xSV(_defecttotalinv, other._defecttotalinv)) { return false; }
            if (!xSV(_capitemflg, other._capitemflg)) { return false; }
            if (!xSV(_userCd, other._userCd)) { return false; }
            if (!xSV(_userNm, other._userNm)) { return false; }
            if (!xSV(_cggdidNm, other._cggdidNm)) { return false; }
            if (!xSV(_inventoryreportinv, other._inventoryreportinv)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_cggdid, other._cggdid)) { return false; }
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
        hs = xCH(hs, _itemName);
        hs = xCH(hs, _dualitemcdflg);
        hs = xCH(hs, _dualitemcd);
        hs = xCH(hs, _ydaytlequlytotalinv);
        hs = xCH(hs, _tdayDiff);
        hs = xCH(hs, _sysinvtotalinv);
        hs = xCH(hs, _investtotalinv);
        hs = xCH(hs, _investkeeplocinv);
        hs = xCH(hs, _investreceivelocinv);
        hs = xCH(hs, _investdamageitem);
        hs = xCH(hs, _investclssifylocinv);
        hs = xCH(hs, _investtmplocinv);
        hs = xCH(hs, _investautoinv);
        hs = xCH(hs, _excesstotalinv);
        hs = xCH(hs, _defecttotalinv);
        hs = xCH(hs, _capitemflg);
        hs = xCH(hs, _userCd);
        hs = xCH(hs, _userNm);
        hs = xCH(hs, _cggdidNm);
        hs = xCH(hs, _inventoryreportinv);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _cggdid);
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
        sb.append(dm).append(xfND(_itemName));
        sb.append(dm).append(xfND(_dualitemcdflg));
        sb.append(dm).append(xfND(_dualitemcd));
        sb.append(dm).append(xfND(_ydaytlequlytotalinv));
        sb.append(dm).append(xfND(_tdayDiff));
        sb.append(dm).append(xfND(_sysinvtotalinv));
        sb.append(dm).append(xfND(_investtotalinv));
        sb.append(dm).append(xfND(_investkeeplocinv));
        sb.append(dm).append(xfND(_investreceivelocinv));
        sb.append(dm).append(xfND(_investdamageitem));
        sb.append(dm).append(xfND(_investclssifylocinv));
        sb.append(dm).append(xfND(_investtmplocinv));
        sb.append(dm).append(xfND(_investautoinv));
        sb.append(dm).append(xfND(_excesstotalinv));
        sb.append(dm).append(xfND(_defecttotalinv));
        sb.append(dm).append(xfND(_capitemflg));
        sb.append(dm).append(xfND(_userCd));
        sb.append(dm).append(xfND(_userNm));
        sb.append(dm).append(xfND(_cggdidNm));
        sb.append(dm).append(xfND(_inventoryreportinv));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_cggdid));
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
    public SqlGetInventoryItem clone() {
        return (SqlGetInventoryItem)super.clone();
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
     * [get] ITEM_NAME: {varchar(60)} <br>
     * @return The value of the column 'ITEM_NAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getItemName() {
        checkSpecifiedProperty("itemName");
        return convertEmptyToNull(_itemName);
    }

    /**
     * [set] ITEM_NAME: {varchar(60)} <br>
     * @param itemName The value of the column 'ITEM_NAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setItemName(String itemName) {
        registerModifiedProperty("itemName");
        _itemName = itemName;
    }

    /**
     * [get] DUALITEMCDFLG: {decimal(16, 6)} <br>
     * @return The value of the column 'DUALITEMCDFLG'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDualitemcdflg() {
        checkSpecifiedProperty("dualitemcdflg");
        return _dualitemcdflg;
    }

    /**
     * [set] DUALITEMCDFLG: {decimal(16, 6)} <br>
     * @param dualitemcdflg The value of the column 'DUALITEMCDFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDualitemcdflg(java.math.BigDecimal dualitemcdflg) {
        registerModifiedProperty("dualitemcdflg");
        _dualitemcdflg = dualitemcdflg;
    }

    /**
     * [get] DUALITEMCD: {varchar(30)} <br>
     * @return The value of the column 'DUALITEMCD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDualitemcd() {
        checkSpecifiedProperty("dualitemcd");
        return convertEmptyToNull(_dualitemcd);
    }

    /**
     * [set] DUALITEMCD: {varchar(30)} <br>
     * @param dualitemcd The value of the column 'DUALITEMCD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDualitemcd(String dualitemcd) {
        registerModifiedProperty("dualitemcd");
        _dualitemcd = dualitemcd;
    }

    /**
     * [get] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getYdaytlequlytotalinv() {
        checkSpecifiedProperty("ydaytlequlytotalinv");
        return _ydaytlequlytotalinv;
    }

    /**
     * [set] YDAYTLEQULYTOTALINV: {decimal(16, 6)} <br>
     * @param ydaytlequlytotalinv The value of the column 'YDAYTLEQULYTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setYdaytlequlytotalinv(java.math.BigDecimal ydaytlequlytotalinv) {
        registerModifiedProperty("ydaytlequlytotalinv");
        _ydaytlequlytotalinv = ydaytlequlytotalinv;
    }

    /**
     * [get] TDAY_DIFF: {decimal(17, 6)} <br>
     * @return The value of the column 'TDAY_DIFF'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getTdayDiff() {
        checkSpecifiedProperty("tdayDiff");
        return _tdayDiff;
    }

    /**
     * [set] TDAY_DIFF: {decimal(17, 6)} <br>
     * @param tdayDiff The value of the column 'TDAY_DIFF'. (NullAllowed: null update allowed for no constraint)
     */
    public void setTdayDiff(java.math.BigDecimal tdayDiff) {
        registerModifiedProperty("tdayDiff");
        _tdayDiff = tdayDiff;
    }

    /**
     * [get] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'SYSINVTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getSysinvtotalinv() {
        checkSpecifiedProperty("sysinvtotalinv");
        return _sysinvtotalinv;
    }

    /**
     * [set] SYSINVTOTALINV: {decimal(16, 6)} <br>
     * @param sysinvtotalinv The value of the column 'SYSINVTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSysinvtotalinv(java.math.BigDecimal sysinvtotalinv) {
        registerModifiedProperty("sysinvtotalinv");
        _sysinvtotalinv = sysinvtotalinv;
    }

    /**
     * [get] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttotalinv() {
        checkSpecifiedProperty("investtotalinv");
        return _investtotalinv;
    }

    /**
     * [set] INVESTTOTALINV: {decimal(16, 6)} <br>
     * @param investtotalinv The value of the column 'INVESTTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttotalinv(java.math.BigDecimal investtotalinv) {
        registerModifiedProperty("investtotalinv");
        _investtotalinv = investtotalinv;
    }

    /**
     * [get] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTKEEPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestkeeplocinv() {
        checkSpecifiedProperty("investkeeplocinv");
        return _investkeeplocinv;
    }

    /**
     * [set] INVESTKEEPLOCINV: {decimal(16, 6)} <br>
     * @param investkeeplocinv The value of the column 'INVESTKEEPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestkeeplocinv(java.math.BigDecimal investkeeplocinv) {
        registerModifiedProperty("investkeeplocinv");
        _investkeeplocinv = investkeeplocinv;
    }

    /**
     * [get] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestreceivelocinv() {
        checkSpecifiedProperty("investreceivelocinv");
        return _investreceivelocinv;
    }

    /**
     * [set] INVESTRECEIVELOCINV: {decimal(16, 6)} <br>
     * @param investreceivelocinv The value of the column 'INVESTRECEIVELOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestreceivelocinv(java.math.BigDecimal investreceivelocinv) {
        registerModifiedProperty("investreceivelocinv");
        _investreceivelocinv = investreceivelocinv;
    }

    /**
     * [get] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTDAMAGEITEM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestdamageitem() {
        checkSpecifiedProperty("investdamageitem");
        return _investdamageitem;
    }

    /**
     * [set] INVESTDAMAGEITEM: {decimal(16, 6)} <br>
     * @param investdamageitem The value of the column 'INVESTDAMAGEITEM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestdamageitem(java.math.BigDecimal investdamageitem) {
        registerModifiedProperty("investdamageitem");
        _investdamageitem = investdamageitem;
    }

    /**
     * [get] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestclssifylocinv() {
        checkSpecifiedProperty("investclssifylocinv");
        return _investclssifylocinv;
    }

    /**
     * [set] INVESTCLSSIFYLOCINV: {decimal(16, 6)} <br>
     * @param investclssifylocinv The value of the column 'INVESTCLSSIFYLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestclssifylocinv(java.math.BigDecimal investclssifylocinv) {
        registerModifiedProperty("investclssifylocinv");
        _investclssifylocinv = investclssifylocinv;
    }

    /**
     * [get] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTTMPLOCINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvesttmplocinv() {
        checkSpecifiedProperty("investtmplocinv");
        return _investtmplocinv;
    }

    /**
     * [set] INVESTTMPLOCINV: {decimal(16, 6)} <br>
     * @param investtmplocinv The value of the column 'INVESTTMPLOCINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvesttmplocinv(java.math.BigDecimal investtmplocinv) {
        registerModifiedProperty("investtmplocinv");
        _investtmplocinv = investtmplocinv;
    }

    /**
     * [get] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @return The value of the column 'INVESTAUTOINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInvestautoinv() {
        checkSpecifiedProperty("investautoinv");
        return _investautoinv;
    }

    /**
     * [set] INVESTAUTOINV: {decimal(16, 6)} <br>
     * @param investautoinv The value of the column 'INVESTAUTOINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInvestautoinv(java.math.BigDecimal investautoinv) {
        registerModifiedProperty("investautoinv");
        _investautoinv = investautoinv;
    }

    /**
     * [get] EXCESSTOTALINV: {decimal(17, 6)} <br>
     * @return The value of the column 'EXCESSTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getExcesstotalinv() {
        checkSpecifiedProperty("excesstotalinv");
        return _excesstotalinv;
    }

    /**
     * [set] EXCESSTOTALINV: {decimal(17, 6)} <br>
     * @param excesstotalinv The value of the column 'EXCESSTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setExcesstotalinv(java.math.BigDecimal excesstotalinv) {
        registerModifiedProperty("excesstotalinv");
        _excesstotalinv = excesstotalinv;
    }

    /**
     * [get] DEFECTTOTALINV: {decimal(17, 6)} <br>
     * @return The value of the column 'DEFECTTOTALINV'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getDefecttotalinv() {
        checkSpecifiedProperty("defecttotalinv");
        return _defecttotalinv;
    }

    /**
     * [set] DEFECTTOTALINV: {decimal(17, 6)} <br>
     * @param defecttotalinv The value of the column 'DEFECTTOTALINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefecttotalinv(java.math.BigDecimal defecttotalinv) {
        registerModifiedProperty("defecttotalinv");
        _defecttotalinv = defecttotalinv;
    }

    /**
     * [get] CAPITEMFLG: {char(1)} <br>
     * @return The value of the column 'CAPITEMFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getCapitemflg() {
        checkSpecifiedProperty("capitemflg");
        return convertEmptyToNull(_capitemflg);
    }

    /**
     * [set] CAPITEMFLG: {char(1)} <br>
     * @param capitemflg The value of the column 'CAPITEMFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCapitemflg(String capitemflg) {
        registerModifiedProperty("capitemflg");
        _capitemflg = capitemflg;
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
     * [get] CGGDID_NM: {varchar(100)} <br>
     * @return The value of the column 'CGGDID_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getCggdidNm() {
        checkSpecifiedProperty("cggdidNm");
        return convertEmptyToNull(_cggdidNm);
    }

    /**
     * [set] CGGDID_NM: {varchar(100)} <br>
     * @param cggdidNm The value of the column 'CGGDID_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCggdidNm(String cggdidNm) {
        registerModifiedProperty("cggdidNm");
        _cggdidNm = cggdidNm;
    }

    /**
     * [get] INVENTORYREPORTINV: {varchar(19)} <br>
     * @return The value of the column 'INVENTORYREPORTINV'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryreportinv() {
        checkSpecifiedProperty("inventoryreportinv");
        return convertEmptyToNull(_inventoryreportinv);
    }

    /**
     * [set] INVENTORYREPORTINV: {varchar(19)} <br>
     * @param inventoryreportinv The value of the column 'INVENTORYREPORTINV'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryreportinv(String inventoryreportinv) {
        registerModifiedProperty("inventoryreportinv");
        _inventoryreportinv = inventoryreportinv;
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
}
