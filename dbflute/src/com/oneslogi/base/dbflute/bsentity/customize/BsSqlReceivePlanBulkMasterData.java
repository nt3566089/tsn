package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlReceivePlanBulkMasterData. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, RECEIVE_PLAN_B_ID, PRODUCT_ID, LOCATION_ID, LOC_ZONE_WAREHOUSE_ID, MW_WAREHOUSE_ID, SUPPLY_CUSTOMER_ID, SUPPLY_VENDOR_FLG, DEPOSIT_CUSTOMER_ID, DEPOSIT_FLG, DECIMAL_EXIST_FLG
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
 * Long receivePlanHId = entity.getReceivePlanHId();
 * Long receivePlanBId = entity.getReceivePlanBId();
 * Long productId = entity.getProductId();
 * Long locationId = entity.getLocationId();
 * Long locZoneWarehouseId = entity.getLocZoneWarehouseId();
 * Long mwWarehouseId = entity.getMwWarehouseId();
 * Long supplyCustomerId = entity.getSupplyCustomerId();
 * String supplyVendorFlg = entity.getSupplyVendorFlg();
 * Long depositCustomerId = entity.getDepositCustomerId();
 * String depositFlg = entity.getDepositFlg();
 * String decimalExistFlg = entity.getDecimalExistFlg();
 * entity.setReceivePlanHId(receivePlanHId);
 * entity.setReceivePlanBId(receivePlanBId);
 * entity.setProductId(productId);
 * entity.setLocationId(locationId);
 * entity.setLocZoneWarehouseId(locZoneWarehouseId);
 * entity.setMwWarehouseId(mwWarehouseId);
 * entity.setSupplyCustomerId(supplyCustomerId);
 * entity.setSupplyVendorFlg(supplyVendorFlg);
 * entity.setDepositCustomerId(depositCustomerId);
 * entity.setDepositFlg(depositFlg);
 * entity.setDecimalExistFlg(decimalExistFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlReceivePlanBulkMasterData extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_PLAN_H_ID: {bigint(19)} */
    protected Long _receivePlanHId;

    /** RECEIVE_PLAN_B_ID: {bigint(19)} */
    protected Long _receivePlanBId;

    /** PRODUCT_ID: {bigint(19)} */
    protected Long _productId;

    /** LOCATION_ID: {bigint(19)} */
    protected Long _locationId;

    /** LOC_ZONE_WAREHOUSE_ID: {bigint(19)} */
    protected Long _locZoneWarehouseId;

    /** MW_WAREHOUSE_ID: {bigint(19)} */
    protected Long _mwWarehouseId;

    /** SUPPLY_CUSTOMER_ID: {bigint(19)} */
    protected Long _supplyCustomerId;

    /** SUPPLY_VENDOR_FLG: {char(1)} */
    protected String _supplyVendorFlg;

    /** DEPOSIT_CUSTOMER_ID: {bigint(19)} */
    protected Long _depositCustomerId;

    /** DEPOSIT_FLG: {char(1), classification=DepositFlg} */
    protected String _depositFlg;

    /** DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} */
    protected String _decimalExistFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlReceivePlanBulkMasterDataDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlReceivePlanBulkMasterData";
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
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of depositFlg as the classification of DepositFlg. <br>
     * DEPOSIT_FLG: {char(1), classification=DepositFlg} <br>
     * 預託先フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DepositFlg getDepositFlgAsDepositFlg() {
        return CDef.DepositFlg.codeOf(getDepositFlg());
    }

    /**
     * Set the value of depositFlg as the classification of DepositFlg. <br>
     * DEPOSIT_FLG: {char(1), classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDepositFlgAsDepositFlg(CDef.DepositFlg cdef) {
        setDepositFlg(cdef != null ? cdef.code() : null);
    }

    /**
     * Get the value of decimalExistFlg as the classification of DecimalExistFlg. <br>
     * DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DecimalExistFlg getDecimalExistFlgAsDecimalExistFlg() {
        return CDef.DecimalExistFlg.codeOf(getDecimalExistFlg());
    }

    /**
     * Set the value of decimalExistFlg as the classification of DecimalExistFlg. <br>
     * DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} <br>
     * 小数有無フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg cdef) {
        setDecimalExistFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of depositFlg as $0 (0). <br>
     * $0: 未使用
     */
    public void setDepositFlg_$0() {
        setDepositFlgAsDepositFlg(CDef.DepositFlg.$0);
    }

    /**
     * Set the value of depositFlg as $1 (1). <br>
     * $1: 使用
     */
    public void setDepositFlg_$1() {
        setDepositFlgAsDepositFlg(CDef.DepositFlg.$1);
    }

    /**
     * Set the value of decimalExistFlg as $0 (0). <br>
     * $0: 小数を含まない
     */
    public void setDecimalExistFlg_$0() {
        setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg.$0);
    }

    /**
     * Set the value of decimalExistFlg as $1 (1). <br>
     * $1: 小数を含む
     */
    public void setDecimalExistFlg_$1() {
        setDecimalExistFlgAsDecimalExistFlg(CDef.DecimalExistFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of depositFlg $0? <br>
     * $0: 未使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDepositFlg$0() {
        CDef.DepositFlg cdef = getDepositFlgAsDepositFlg();
        return cdef != null ? cdef.equals(CDef.DepositFlg.$0) : false;
    }

    /**
     * Is the value of depositFlg $1? <br>
     * $1: 使用
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDepositFlg$1() {
        CDef.DepositFlg cdef = getDepositFlgAsDepositFlg();
        return cdef != null ? cdef.equals(CDef.DepositFlg.$1) : false;
    }

    /**
     * Is the value of decimalExistFlg $0? <br>
     * $0: 小数を含まない
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDecimalExistFlg$0() {
        CDef.DecimalExistFlg cdef = getDecimalExistFlgAsDecimalExistFlg();
        return cdef != null ? cdef.equals(CDef.DecimalExistFlg.$0) : false;
    }

    /**
     * Is the value of decimalExistFlg $1? <br>
     * $1: 小数を含む
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDecimalExistFlg$1() {
        CDef.DecimalExistFlg cdef = getDecimalExistFlgAsDecimalExistFlg();
        return cdef != null ? cdef.equals(CDef.DecimalExistFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'depositFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDepositFlgName() {
        CDef.DepositFlg cdef = getDepositFlgAsDepositFlg();
        return cdef != null ? cdef.name() : null;
    }

    /**
     * Get the value of the column 'decimalExistFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDecimalExistFlgName() {
        CDef.DecimalExistFlg cdef = getDecimalExistFlgAsDecimalExistFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsSqlReceivePlanBulkMasterData) {
            BsSqlReceivePlanBulkMasterData other = (BsSqlReceivePlanBulkMasterData)obj;
            if (!xSV(_receivePlanHId, other._receivePlanHId)) { return false; }
            if (!xSV(_receivePlanBId, other._receivePlanBId)) { return false; }
            if (!xSV(_productId, other._productId)) { return false; }
            if (!xSV(_locationId, other._locationId)) { return false; }
            if (!xSV(_locZoneWarehouseId, other._locZoneWarehouseId)) { return false; }
            if (!xSV(_mwWarehouseId, other._mwWarehouseId)) { return false; }
            if (!xSV(_supplyCustomerId, other._supplyCustomerId)) { return false; }
            if (!xSV(_supplyVendorFlg, other._supplyVendorFlg)) { return false; }
            if (!xSV(_depositCustomerId, other._depositCustomerId)) { return false; }
            if (!xSV(_depositFlg, other._depositFlg)) { return false; }
            if (!xSV(_decimalExistFlg, other._decimalExistFlg)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receivePlanHId);
        hs = xCH(hs, _receivePlanBId);
        hs = xCH(hs, _productId);
        hs = xCH(hs, _locationId);
        hs = xCH(hs, _locZoneWarehouseId);
        hs = xCH(hs, _mwWarehouseId);
        hs = xCH(hs, _supplyCustomerId);
        hs = xCH(hs, _supplyVendorFlg);
        hs = xCH(hs, _depositCustomerId);
        hs = xCH(hs, _depositFlg);
        hs = xCH(hs, _decimalExistFlg);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receivePlanHId));
        sb.append(dm).append(xfND(_receivePlanBId));
        sb.append(dm).append(xfND(_productId));
        sb.append(dm).append(xfND(_locationId));
        sb.append(dm).append(xfND(_locZoneWarehouseId));
        sb.append(dm).append(xfND(_mwWarehouseId));
        sb.append(dm).append(xfND(_supplyCustomerId));
        sb.append(dm).append(xfND(_supplyVendorFlg));
        sb.append(dm).append(xfND(_depositCustomerId));
        sb.append(dm).append(xfND(_depositFlg));
        sb.append(dm).append(xfND(_decimalExistFlg));
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
    public SqlReceivePlanBulkMasterData clone() {
        return (SqlReceivePlanBulkMasterData)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanHId() {
        checkSpecifiedProperty("receivePlanHId");
        return _receivePlanHId;
    }

    /**
     * [set] RECEIVE_PLAN_H_ID: {bigint(19)} <br>
     * @param receivePlanHId The value of the column 'RECEIVE_PLAN_H_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanHId(Long receivePlanHId) {
        registerModifiedProperty("receivePlanHId");
        _receivePlanHId = receivePlanHId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanBId() {
        checkSpecifiedProperty("receivePlanBId");
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {bigint(19)} <br>
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        registerModifiedProperty("receivePlanBId");
        _receivePlanBId = receivePlanBId;
    }

    /**
     * [get] PRODUCT_ID: {bigint(19)} <br>
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getProductId() {
        checkSpecifiedProperty("productId");
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {bigint(19)} <br>
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProductId(Long productId) {
        registerModifiedProperty("productId");
        _productId = productId;
    }

    /**
     * [get] LOCATION_ID: {bigint(19)} <br>
     * @return The value of the column 'LOCATION_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocationId() {
        checkSpecifiedProperty("locationId");
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {bigint(19)} <br>
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocationId(Long locationId) {
        registerModifiedProperty("locationId");
        _locationId = locationId;
    }

    /**
     * [get] LOC_ZONE_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'LOC_ZONE_WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getLocZoneWarehouseId() {
        checkSpecifiedProperty("locZoneWarehouseId");
        return _locZoneWarehouseId;
    }

    /**
     * [set] LOC_ZONE_WAREHOUSE_ID: {bigint(19)} <br>
     * @param locZoneWarehouseId The value of the column 'LOC_ZONE_WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLocZoneWarehouseId(Long locZoneWarehouseId) {
        registerModifiedProperty("locZoneWarehouseId");
        _locZoneWarehouseId = locZoneWarehouseId;
    }

    /**
     * [get] MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @return The value of the column 'MW_WAREHOUSE_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getMwWarehouseId() {
        checkSpecifiedProperty("mwWarehouseId");
        return _mwWarehouseId;
    }

    /**
     * [set] MW_WAREHOUSE_ID: {bigint(19)} <br>
     * @param mwWarehouseId The value of the column 'MW_WAREHOUSE_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMwWarehouseId(Long mwWarehouseId) {
        registerModifiedProperty("mwWarehouseId");
        _mwWarehouseId = mwWarehouseId;
    }

    /**
     * [get] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getSupplyCustomerId() {
        checkSpecifiedProperty("supplyCustomerId");
        return _supplyCustomerId;
    }

    /**
     * [set] SUPPLY_CUSTOMER_ID: {bigint(19)} <br>
     * @param supplyCustomerId The value of the column 'SUPPLY_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyCustomerId(Long supplyCustomerId) {
        registerModifiedProperty("supplyCustomerId");
        _supplyCustomerId = supplyCustomerId;
    }

    /**
     * [get] SUPPLY_VENDOR_FLG: {char(1)} <br>
     * @return The value of the column 'SUPPLY_VENDOR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getSupplyVendorFlg() {
        checkSpecifiedProperty("supplyVendorFlg");
        return convertEmptyToNull(_supplyVendorFlg);
    }

    /**
     * [set] SUPPLY_VENDOR_FLG: {char(1)} <br>
     * @param supplyVendorFlg The value of the column 'SUPPLY_VENDOR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSupplyVendorFlg(String supplyVendorFlg) {
        registerModifiedProperty("supplyVendorFlg");
        _supplyVendorFlg = supplyVendorFlg;
    }

    /**
     * [get] DEPOSIT_CUSTOMER_ID: {bigint(19)} <br>
     * @return The value of the column 'DEPOSIT_CUSTOMER_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getDepositCustomerId() {
        checkSpecifiedProperty("depositCustomerId");
        return _depositCustomerId;
    }

    /**
     * [set] DEPOSIT_CUSTOMER_ID: {bigint(19)} <br>
     * @param depositCustomerId The value of the column 'DEPOSIT_CUSTOMER_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositCustomerId(Long depositCustomerId) {
        registerModifiedProperty("depositCustomerId");
        _depositCustomerId = depositCustomerId;
    }

    /**
     * [get] DEPOSIT_FLG: {char(1), classification=DepositFlg} <br>
     * // cls(DepositFlg)
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDepositFlg() {
        checkSpecifiedProperty("depositFlg");
        return convertEmptyToNull(_depositFlg);
    }

    /**
     * [set] DEPOSIT_FLG: {char(1), classification=DepositFlg} <br>
     * // cls(DepositFlg)
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDepositFlg(String depositFlg) {
        registerModifiedProperty("depositFlg");
        _depositFlg = depositFlg;
    }

    /**
     * [get] DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} <br>
     * // cls(DecimalExistFlg)
     * @return The value of the column 'DECIMAL_EXIST_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getDecimalExistFlg() {
        checkSpecifiedProperty("decimalExistFlg");
        return convertEmptyToNull(_decimalExistFlg);
    }

    /**
     * [set] DECIMAL_EXIST_FLG: {char(1), classification=DecimalExistFlg} <br>
     * // cls(DecimalExistFlg)
     * @param decimalExistFlg The value of the column 'DECIMAL_EXIST_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDecimalExistFlg(String decimalExistFlg) {
        registerModifiedProperty("decimalExistFlg");
        _decimalExistFlg = decimalExistFlg;
    }
}
