package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlStockCheck. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     PRODUCT_CD, STOCKQTY, ADD_DT, SNAME, USERNUM3, UNIT1, UNIT2, CHARGE_NUM, INVENTORY_NUM, INVENTORY_KEY, CENTER_CD, CENTER_NM, CLIENT_CD, CLIENT_NM
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
 * String productCd = entity.getProductCd();
 * Long stockqty = entity.getStockqty();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String sname = entity.getSname();
 * Long usernum3 = entity.getUsernum3();
 * java.math.BigDecimal unit1 = entity.getUnit1();
 * java.math.BigDecimal unit2 = entity.getUnit2();
 * java.math.BigDecimal chargeNum = entity.getChargeNum();
 * java.math.BigDecimal inventoryNum = entity.getInventoryNum();
 * Long inventoryKey = entity.getInventoryKey();
 * String centerCd = entity.getCenterCd();
 * String centerNm = entity.getCenterNm();
 * String clientCd = entity.getClientCd();
 * String clientNm = entity.getClientNm();
 * entity.setProductCd(productCd);
 * entity.setStockqty(stockqty);
 * entity.setAddDt(addDt);
 * entity.setSname(sname);
 * entity.setUsernum3(usernum3);
 * entity.setUnit1(unit1);
 * entity.setUnit2(unit2);
 * entity.setChargeNum(chargeNum);
 * entity.setInventoryNum(inventoryNum);
 * entity.setInventoryKey(inventoryKey);
 * entity.setCenterCd(centerCd);
 * entity.setCenterNm(centerNm);
 * entity.setClientCd(clientCd);
 * entity.setClientNm(clientNm);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlStockCheck extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** PRODUCT_CD: {varchar(30)} */
    protected String _productCd;

    /** STOCKQTY: {bigint(19)} */
    protected Long _stockqty;

    /** ADD_DT: {datetime2(26, 6)} */
    protected java.sql.Timestamp _addDt;

    /** SNAME: {varchar(60)} */
    protected String _sname;

    /** USERNUM3: {bigint(19)} */
    protected Long _usernum3;

    /** UNIT1: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit1;

    /** UNIT2: {decimal(16, 6)} */
    protected java.math.BigDecimal _unit2;

    /** CHARGE_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _chargeNum;

    /** INVENTORY_NUM: {decimal(16, 6)} */
    protected java.math.BigDecimal _inventoryNum;

    /** INVENTORY_KEY: {bigint(19)} */
    protected Long _inventoryKey;

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
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlStockCheckDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlStockCheck";
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
        if (obj instanceof BsSqlStockCheck) {
            BsSqlStockCheck other = (BsSqlStockCheck)obj;
            if (!xSV(_productCd, other._productCd)) { return false; }
            if (!xSV(_stockqty, other._stockqty)) { return false; }
            if (!xSV(_addDt, other._addDt)) { return false; }
            if (!xSV(_sname, other._sname)) { return false; }
            if (!xSV(_usernum3, other._usernum3)) { return false; }
            if (!xSV(_unit1, other._unit1)) { return false; }
            if (!xSV(_unit2, other._unit2)) { return false; }
            if (!xSV(_chargeNum, other._chargeNum)) { return false; }
            if (!xSV(_inventoryNum, other._inventoryNum)) { return false; }
            if (!xSV(_inventoryKey, other._inventoryKey)) { return false; }
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
        hs = xCH(hs, _productCd);
        hs = xCH(hs, _stockqty);
        hs = xCH(hs, _addDt);
        hs = xCH(hs, _sname);
        hs = xCH(hs, _usernum3);
        hs = xCH(hs, _unit1);
        hs = xCH(hs, _unit2);
        hs = xCH(hs, _chargeNum);
        hs = xCH(hs, _inventoryNum);
        hs = xCH(hs, _inventoryKey);
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
        sb.append(dm).append(xfND(_productCd));
        sb.append(dm).append(xfND(_stockqty));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_sname));
        sb.append(dm).append(xfND(_usernum3));
        sb.append(dm).append(xfND(_unit1));
        sb.append(dm).append(xfND(_unit2));
        sb.append(dm).append(xfND(_chargeNum));
        sb.append(dm).append(xfND(_inventoryNum));
        sb.append(dm).append(xfND(_inventoryKey));
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
    public SqlStockCheck clone() {
        return (SqlStockCheck)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
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
     * [get] STOCKQTY: {bigint(19)} <br>
     * @return The value of the column 'STOCKQTY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getStockqty() {
        checkSpecifiedProperty("stockqty");
        return _stockqty;
    }

    /**
     * [set] STOCKQTY: {bigint(19)} <br>
     * @param stockqty The value of the column 'STOCKQTY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setStockqty(Long stockqty) {
        registerModifiedProperty("stockqty");
        _stockqty = stockqty;
    }

    /**
     * [get] ADD_DT: {datetime2(26, 6)} <br>
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {datetime2(26, 6)} <br>
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] SNAME: {varchar(60)} <br>
     * @return The value of the column 'SNAME'. (NullAllowed even if selected: for no constraint)
     */
    public String getSname() {
        checkSpecifiedProperty("sname");
        return convertEmptyToNull(_sname);
    }

    /**
     * [set] SNAME: {varchar(60)} <br>
     * @param sname The value of the column 'SNAME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSname(String sname) {
        registerModifiedProperty("sname");
        _sname = sname;
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
     * [get] INVENTORY_NUM: {decimal(16, 6)} <br>
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getInventoryNum() {
        checkSpecifiedProperty("inventoryNum");
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {decimal(16, 6)} <br>
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        registerModifiedProperty("inventoryNum");
        _inventoryNum = inventoryNum;
    }

    /**
     * [get] INVENTORY_KEY: {bigint(19)} <br>
     * @return The value of the column 'INVENTORY_KEY'. (NullAllowed even if selected: for no constraint)
     */
    public Long getInventoryKey() {
        checkSpecifiedProperty("inventoryKey");
        return _inventoryKey;
    }

    /**
     * [set] INVENTORY_KEY: {bigint(19)} <br>
     * @param inventoryKey The value of the column 'INVENTORY_KEY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInventoryKey(Long inventoryKey) {
        registerModifiedProperty("inventoryKey");
        _inventoryKey = inventoryKey;
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
