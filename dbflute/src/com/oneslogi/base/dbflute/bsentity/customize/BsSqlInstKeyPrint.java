package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlInstKeyPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     INVENTORY_H_ID, INVENTORY_DT, PRODUCT_CD, PRODUCT_NM, CGGDID, FCFLG, USERNUM4, USERNUM3, DIFFQTY_HENPIN, DIFFQTY_TAXREFOND, CHARGE_NUM, SUFFERER_QTY, MONTH_STATUSSU, BLUK_RECIVED_QTY, REFUNDITEM_QTY, UNIT1, UNIT2, CGGDID_NM, FCFLG_NM
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
 * Long inventoryHId = entity.getInventoryHId();
 * String inventoryDt = entity.getInventoryDt();
 * String productCd = entity.getProductCd();
 * String productNm = entity.getProductNm();
 * String cggdid = entity.getCggdid();
 * String fcflg = entity.getFcflg();
 * Long usernum4 = entity.getUsernum4();
 * Long usernum3 = entity.getUsernum3();
 * Long diffqtyHenpin = entity.getDiffqtyHenpin();
 * Long diffqtyTaxrefond = entity.getDiffqtyTaxrefond();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * Long suffererQty = entity.getSuffererQty();
 * Long monthStatussu = entity.getMonthStatussu();
 * Long blukRecivedQty = entity.getBlukRecivedQty();
 * Long refunditemQty = entity.getRefunditemQty();
 * java.math.BigDecimal unit1 = entity.getUnit1();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * String cggdidNm = entity.getCggdidNm();
 * String fcflgNm = entity.getFcflgNm();
 * entity.setInventoryHId(inventoryHId);
 * entity.setInventoryDt(inventoryDt);
 * entity.setProductCd(productCd);
 * entity.setProductNm(productNm);
 * entity.setCggdid(cggdid);
 * entity.setFcflg(fcflg);
 * entity.setUsernum4(usernum4);
 * entity.setUsernum3(usernum3);
 * entity.setDiffqtyHenpin(diffqtyHenpin);
 * entity.setDiffqtyTaxrefond(diffqtyTaxrefond);
 * entity.setChargeNum(chargeNum);
 * entity.setSuffererQty(suffererQty);
 * entity.setMonthStatussu(monthStatussu);
 * entity.setBlukRecivedQty(blukRecivedQty);
 * entity.setRefunditemQty(refunditemQty);
 * entity.setUnit1(unit1);
 * entity.setUnit2(unit2);
 * entity.setCggdidNm(cggdidNm);
 * entity.setFcflgNm(fcflgNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlInstKeyPrint extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** INVENTORY_H_ID: {bigint(19)} */
    protected Long _inventoryHId;

    /** INVENTORY_DT: {varchar(8)} */
    protected String _inventoryDt;

    /** PRODUCT_CD: {varchar(100)} */
    protected String _productCd;

    /** PRODUCT_NM: {varchar(255)} */
    protected String _productNm;

    /** CGGDID: {varchar(30)} */
    protected String _cggdid;

    /** FCFLG: {varchar(30)} */
    protected String _fcflg;

    /** USERNUM4: {bigint(19)} */
    protected Long _usernum4;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** DIFFQTY_HENPIN: {bigint(19)} */
    protected Long _diffqtyHenpin;

    /** DIFFQTY_TAXREFOND: {bigint(19)} */
    protected Long _diffqtyTaxrefond;

    /** CHARGE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _chargeNum;

    /** SUFFERER_QTY: {bigint(19)} */
    protected Long _suffererQty;

    /** MONTH_STATUSSU: {bigint(19)} */
    protected Long _monthStatussu;

    /** BLUK_RECIVED_QTY: {bigint(19)} */
    protected Long _blukRecivedQty;

    /** REFUNDITEM_QTY: {bigint(19)} */
    protected Long _refunditemQty;

    /** UNIT1: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit2;

    /** CGGDID_NM: {varchar(100)} */
    protected String _cggdidNm;

    /** FCFLG_NM: {varchar(100)} */
    protected String _fcflgNm;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlInstKeyPrintDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlInstKeyPrint";
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
        if (obj instanceof BsSqlInstKeyPrint) {
            BsSqlInstKeyPrint other = (BsSqlInstKeyPrint)obj;
            if (!xSV(_inventoryHId, other._inventoryHId)) { return false; }
            if (!xSV(_inventoryDt, other._inventoryDt)) { return false; }
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_productNm, other._productNm)) { return false; }
            if (!xSV(_cggdid, other._cggdid)) { return false; }
            if (!xSV(_fcflg, other._fcflg)) { return false; }
            if (!xSV(_usernum4, other._usernum4)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_diffqtyHenpin, other._diffqtyHenpin)) { return false; }
            if (!xSV(_diffqtyTaxrefond, other._diffqtyTaxrefond)) { return false; }
            if (!xSV(_chargeNum, other._chargeNum)) { return false; }
            if (!xSV(_suffererQty, other._suffererQty)) { return false; }
            if (!xSV(_monthStatussu, other._monthStatussu)) { return false; }
            if (!xSV(_blukRecivedQty, other._blukRecivedQty)) { return false; }
            if (!xSV(_refunditemQty, other._refunditemQty)) { return false; }
            if (!xSV(_unit1, other._unit1)) { return false; }
            if (!xSV(_unit2, other._unit2)) { return false; }
            if (!xSV(_cggdidNm, other._cggdidNm)) { return false; }
            if (!xSV(_fcflgNm, other._fcflgNm)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _inventoryHId);
        hs = xCH(hs, _inventoryDt);
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _productNm);
        hs = xCH(hs, _cggdid);
        hs = xCH(hs, _fcflg);
        hs = xCH(hs, _usernum4);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _diffqtyHenpin);
        hs = xCH(hs, _diffqtyTaxrefond);
        hs = xCH(hs, _chargeNum);
        hs = xCH(hs, _suffererQty);
        hs = xCH(hs, _monthStatussu);
        hs = xCH(hs, _blukRecivedQty);
        hs = xCH(hs, _refunditemQty);
        hs = xCH(hs, _unit1);
        hs = xCH(hs, _unit2);
        hs = xCH(hs, _cggdidNm);
        hs = xCH(hs, _fcflgNm);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_inventoryHId));
        sb.append(dm).append(xfND(_inventoryDt));
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_productNm));
        sb.append(dm).append(xfND(_cggdid));
        sb.append(dm).append(xfND(_fcflg));
        sb.append(dm).append(xfND(_usernum4));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_diffqtyHenpin));
        sb.append(dm).append(xfND(_diffqtyTaxrefond));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_suffererQty));
        sb.append(dm).append(xfND(_monthStatussu));
        sb.append(dm).append(xfND(_blukRecivedQty));
        sb.append(dm).append(xfND(_refunditemQty));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_cggdidNm));
        sb.append(dm).append(xfND(_fcflgNm));
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
    public SqlInstKeyPrint clone() {
        return (SqlInstKeyPrint)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] INVENTORY_H_ID: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryHId() {
        checkSpecifiedProperty("inventoryHId");
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {bigint(19)} <br>
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryHId(Long inventoryHId) {
        registerModifiedProperty("inventoryHId");
        _inventoryHId = inventoryHId;
    }

    /**
     * [get] INVENTORY_DT: {varchar(8)} <br>
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getInventoryDt() {
        checkSpecifiedProperty("inventoryDt");
        return convertEmptyToNull(_inventoryDt);
    }

    /**
     * [set] INVENTORY_DT: {varchar(8)} <br>
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryDt(String inventoryDt) {
        registerModifiedProperty("inventoryDt");
        _inventoryDt = inventoryDt;
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

    /**
     * [get] FCFLG: {varchar(30)} <br>
     * @return The value of the column 'FCFLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getFcflg() {
        checkSpecifiedProperty("fcflg");
        return convertEmptyToNull(_fcflg);
    }

    /**
     * [set] FCFLG: {varchar(30)} <br>
     * @param fcflg The value of the column 'FCFLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFcflg(String fcflg) {
        registerModifiedProperty("fcflg");
        _fcflg = fcflg;
    }

    /**
     * [get] USERNUM4: {bigint(19)} <br>
     * @return The value of the column 'USERNUM4'. (NullAllowed even if selected: for no constraint)
     */
    public Long getUsernum4() {
        checkSpecifiedProperty("usernum4");
        return _usernum4;
    }

    /**
     * [set] USERNUM4: {bigint(19)} <br>
     * @param usernum4 The value of the column 'USERNUM4'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUsernum4(Long usernum4) {
        registerModifiedProperty("usernum4");
        _usernum4 = usernum4;
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
     * [get] DIFFQTY_HENPIN: {bigint(19)} <br>
     * @return The value of the column 'DIFFQTY_HENPIN'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDiffqtyHenpin() {
        checkSpecifiedProperty("diffqtyHenpin");
        return _diffqtyHenpin;
    }

    /**
     * [set] DIFFQTY_HENPIN: {bigint(19)} <br>
     * @param diffqtyHenpin The value of the column 'DIFFQTY_HENPIN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffqtyHenpin(Long diffqtyHenpin) {
        registerModifiedProperty("diffqtyHenpin");
        _diffqtyHenpin = diffqtyHenpin;
    }

    /**
     * [get] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * @return The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDiffqtyTaxrefond() {
        checkSpecifiedProperty("diffqtyTaxrefond");
        return _diffqtyTaxrefond;
    }

    /**
     * [set] DIFFQTY_TAXREFOND: {bigint(19)} <br>
     * @param diffqtyTaxrefond The value of the column 'DIFFQTY_TAXREFOND'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDiffqtyTaxrefond(Long diffqtyTaxrefond) {
        registerModifiedProperty("diffqtyTaxrefond");
        _diffqtyTaxrefond = diffqtyTaxrefond;
    }

    /**
     * [get] CHARGE_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'CHARGE_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getChargeNum() {
        checkSpecifiedProperty("chargeNum");
        return _chargeNum;
    }

    /**
     * [set] CHARGE_NUM: {decimal(16, 6)} <br>
     * @param chargeNum The value of the column 'CHARGE_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setChargeNum(java.math.BigDecimal chargeNum) {
        registerModifiedProperty("chargeNum");
        _chargeNum = chargeNum;
    }

    /**
     * [get] SUFFERER_QTY: {bigint(19)} <br>
     * @return The value of the column 'SUFFERER_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSuffererQty() {
        checkSpecifiedProperty("suffererQty");
        return _suffererQty;
    }

    /**
     * [set] SUFFERER_QTY: {bigint(19)} <br>
     * @param suffererQty The value of the column 'SUFFERER_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSuffererQty(Long suffererQty) {
        registerModifiedProperty("suffererQty");
        _suffererQty = suffererQty;
    }

    /**
     * [get] MONTH_STATUSSU: {bigint(19)} <br>
     * @return The value of the column 'MONTH_STATUSSU'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMonthStatussu() {
        checkSpecifiedProperty("monthStatussu");
        return _monthStatussu;
    }

    /**
     * [set] MONTH_STATUSSU: {bigint(19)} <br>
     * @param monthStatussu The value of the column 'MONTH_STATUSSU'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMonthStatussu(Long monthStatussu) {
        registerModifiedProperty("monthStatussu");
        _monthStatussu = monthStatussu;
    }

    /**
     * [get] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * @return The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getBlukRecivedQty() {
        checkSpecifiedProperty("blukRecivedQty");
        return _blukRecivedQty;
    }

    /**
     * [set] BLUK_RECIVED_QTY: {bigint(19)} <br>
     * @param blukRecivedQty The value of the column 'BLUK_RECIVED_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setBlukRecivedQty(Long blukRecivedQty) {
        registerModifiedProperty("blukRecivedQty");
        _blukRecivedQty = blukRecivedQty;
    }

    /**
     * [get] REFUNDITEM_QTY: {bigint(19)} <br>
     * @return The value of the column 'REFUNDITEM_QTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getRefunditemQty() {
        checkSpecifiedProperty("refunditemQty");
        return _refunditemQty;
    }

    /**
     * [set] REFUNDITEM_QTY: {bigint(19)} <br>
     * @param refunditemQty The value of the column 'REFUNDITEM_QTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setRefunditemQty(Long refunditemQty) {
        registerModifiedProperty("refunditemQty");
        _refunditemQty = refunditemQty;
    }

    /**
     * [get] UNIT1: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT1'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit1() {
        checkSpecifiedProperty("unit1");
        return _unit1;
    }

    /**
     * [set] UNIT1: {decimal(16, 6)} <br>
     * @param unit1 The value of the column 'UNIT1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit1(java.math.BigDecimal unit1) {
        registerModifiedProperty("unit1");
        _unit1 = unit1;
    }

    /**
     * [get] UNIT2: {decimal(16, 6)} <br>
     * @return The value of the column 'UNIT2'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getUnit2() {
        checkSpecifiedProperty("unit2");
        return _unit2;
    }

    /**
     * [set] UNIT2: {decimal(16, 6)} <br>
     * @param unit2 The value of the column 'UNIT2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnit2(java.math.BigDecimal unit2) {
        registerModifiedProperty("unit2");
        _unit2 = unit2;
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
     * [get] FCFLG_NM: {varchar(100)} <br>
     * @return The value of the column 'FCFLG_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getFcflgNm() {
        checkSpecifiedProperty("fcflgNm");
        return convertEmptyToNull(_fcflgNm);
    }

    /**
     * [set] FCFLG_NM: {varchar(100)} <br>
     * @param fcflgNm The value of the column 'FCFLG_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFcflgNm(String fcflgNm) {
        registerModifiedProperty("fcflgNm");
        _fcflgNm = fcflgNm;
    }
}
